package onlinestore;

import onlinestore.exception.OutOfStockException;
import onlinestore.menu.Admin;
import onlinestore.menu.Menu;
import onlinestore.order.Order;
import onlinestore.order.OrderStatus;
import onlinestore.order.PaymentMethod;
import onlinestore.product.Product;
import onlinestore.product.ProductType;
import onlinestore.storage.OrderStorage;
import onlinestore.storage.ProductStorage;
import onlinestore.storage.UserStorage;
import onlinestore.user.User;
import onlinestore.user.UserType;
import onlinestore.util.CheckingUtil;
import onlinestore.util.DateUtil;
import onlinestore.util.StorageSerializeUtil;

import java.util.Date;
import java.util.Scanner;


public class OnlineStoreMain implements Admin, Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static OrderStorage orderStorage = StorageSerializeUtil.deserializeOrderStorage();
    private static ProductStorage productStorage = StorageSerializeUtil.deserializeProductStorage();
    private static UserStorage userStorage = StorageSerializeUtil.deserializeUserStorage();
    private static ProductType productType;
    private static UserType userType;
    private static OrderStatus orderStatus;
    private static PaymentMethod paymentMethod;
    private static User currentUser;
    private static CheckingUtil checkingUtil = new CheckingUtil();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            Admin.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
            }
        }
    }

    private static void login() {
        System.out.println("input your email");
        String email = scanner.nextLine();
        System.out.println("password");
        String password = scanner.nextLine();
        User user = new User();
        if (CheckingUtil.checkPassword(user, password)) {
            currentUser = user;
            if (user.getUserType() == UserType.ADMIN) {
                adminCommands();
            } else if (user.getUserType() == UserType.USER) {
                userCommands();
            }
        } else {
            System.out.println("Data isn't correct, please login again: ");
            return;
        }
        System.out.println("Everything is correct, you can enter your profile: ");
    }


    private static void register() {
        System.out.println("Please input your id:");
        String id = scanner.nextLine();
        System.out.println("please input your name");
        String name = scanner.nextLine();
        System.out.println("please input your email");
        String email = scanner.nextLine();
        String password = null;
        System.out.println("please input your password");
        password = scanner.nextLine();
        if (userStorage.getById(email) != null || !CheckingUtil.checkEmail(email) || password.isEmpty()) {
            System.out.println("this data is incorrect, try again ");
            return;
        }
        userStorage.add(new User(id, name, email, password, UserType.USER));
        login();
    }

    private static void adminCommands() {
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("'your profile' -> " + currentUser.getName() + " | your Type{" + currentUser.getUserType() + "}" + " | user id " + currentUser.getId());
            Admin.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOG_OUT:
                    run = false;
                    break;
            //case PRINT_ALL_PRODUCTS:
            //    printAllProducts();
            //    break;
            //case ADD_PRODUCT:
            //    addProduct();
            //    break;
                case PRINT_USERS:
                    printUsers();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    removeProductById();
                    break;
                case PRINT_ORDERS:
                    orderStorage.print();
                    break;
                case CHANGE_ORDER_STATUS:
                    changeOrderStatus();
                    break;
            }
        }

    }

    private static void printAllProducts() {
    }

    private static void removeProductById() {
    }

    private static void printUsers() {
    }

    private static void changeOrderStatus() {

    }

    private static void changeUserRole() {
        System.out.println("input User id for change");
        String id = scanner.nextLine();
        User userById = (User) userStorage.getById(id);
        if (userById == null) {
            System.out.println("that user with " + id + " " + " doesn't exist");
            return;
        }
        userStorage.changeUserTypeById(userById);
        System.out.println("that user Role already ADMIN");
    }

    private static void addProduct() {
        System.out.println("add id of the product");
        String id = scanner.nextLine();
        System.out.println("add name of the product");
        String name = scanner.nextLine();
        System.out.println("add description of the product");
        String description = scanner.nextLine();
        System.out.println("add price of the product");
        String priceWithStr = scanner.nextLine();
        System.out.println("add count of the product in stock");
        String stockQtyWithStr = scanner.nextLine();
        ProductType[] productTypes = ProductType.values();
        for (ProductType type : productTypes) {
            System.out.println();
            System.out.print(productType.ordinal() + ") " + productType + " ");
        }
        System.out.println();
        System.out.println("add Product Types:");
        String selectedCategory = scanner.nextLine();
        if (!CheckingUtil.isDigit(priceWithStr) || !CheckingUtil.isDigit(stockQtyWithStr) || !CheckingUtil.isDigit(selectedCategory)) {
            System.err.println("that fields (stock, price and category) " + " must be only digit");
            return;
        }
        double price = Double.parseDouble(priceWithStr);
        int stockQty = Integer.parseInt(stockQtyWithStr);
        if (Integer.parseInt(selectedCategory) >= productType.ordinal() && Integer.parseInt(selectedCategory) < 0) {
            System.err.println("please select correct category, that category doesn't exist");
        } else {
            productStorage.add(new Product(id, name, description, price, stockQty, productType));
            StorageSerializeUtil.serializeProductStorage(productStorage);
        }
    }


    private static void userCommands() {
        boolean run = true;
        while (run) {
            Object user = orderStorage.statusDelivered(scanner.nextLine());
            System.out.println("------------------------------------------------------------------------------------------------");
            System.out.println("'your profile' -> " + currentUser.getName() + " | your UserType {" + currentUser.getUserType() + "}" + " | user id " + currentUser.getId());
            Admin.printLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case Admin.LOGOUT:
                    run = false;
                    break;
                case PRINT_ALL_PRODUCTS:
                    productStorage.print();
                    break;
              //case BUY_PRODUCT:
              //    CheckForBuy();
              //    break;
              //case PRINT_MY_ORDERS:
              //   // printCurrentOrders();
                 //   break;
                case CANCEL_ORDER_BY_ID:
                    System.out.println("input id for cancel");
                    cancelOrderById();
                    break;
            }
        }


    }

    private static void cancelOrderById() {
       // printCurrentOrders();
        System.out.println("Please input Order Id");
        String orderId = scanner.nextLine();
        if (orderId != null) {
            cancelOrderById();
        } else {
            System.out.println("Order Id " + orderId + " does not exists!!!");
        }
    }


    private static void printCurrentOrders(String userId) {

    }


    private static void CheckForBuy() {
        productStorage.print();
        System.out.println("please write id of the product");
        String productId = scanner.nextLine();
        Product product = (Product) productStorage.getProductById(productId);
        if (product == null) {
            System.err.println("product " + productId + " " + " doesn't exist");
            return;
        }
        System.out.println("how many products would you like");
        String countWithStr = scanner.nextLine();
        if (!CheckingUtil.isDigit(countWithStr)) {
            System.err.println("price can't be String -> " + countWithStr);
            return;
        }
        double totalPayment = 0.0;
        totalPayment = productStorage.costOfTheProduct();
        buyProduct(product, totalPayment, Integer.parseInt(countWithStr));
    }


    private static void buyProduct(Product product, double totalPayment, int count) {
        PaymentMethod[] paymentMethods = PaymentMethod.values();
        for (PaymentMethod value : paymentMethods) {
            System.out.print(value.ordinal() + ") " + value + " ");
        }
        System.out.println("select your payment methods");
        String payMeth = scanner.nextLine();
        if (!CheckingUtil.isDigit(payMeth) || paymentMethods.length <= Integer.parseInt(payMeth)) {
            System.err.println("this payment method doesn't exist");
            userCommands();
        }
        System.out.println("will you want to buy this product this count " + count + " total cost is " + totalPayment +
                " if you want to buy. write - [yes} if you won't to buy, write- {any word}");
        String question = scanner.nextLine();
        if (question.equals("yes")) {
            //orderStorage.add(new Order(currentUser, product, new Date(), totalPayment, OrderStatus.NEW, count, paymentMethods.length[Integer.parseInt(payMeth)]));
            System.out.println("order already registered");
        } else {
            userCommands();
        }
    }


}









