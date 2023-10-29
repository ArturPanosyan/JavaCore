package onlinestore;

import onlinestore.menu.Login;
import onlinestore.menu.Admin;
import onlinestore.menu.Menu;
import onlinestore.order.OrderStatus;
import onlinestore.order.PaymentMethod;
import onlinestore.product.Product;
import onlinestore.product.ProductType;
import onlinestore.storage.OrderStorage;
import onlinestore.storage.ProductStorage;
import onlinestore.storage.UserStorage;
import onlinestore.user.UserType;

import java.util.Scanner;



public class OnlineStoreMain implements Admin, Menu {

    private static Scanner scanner = new Scanner(System.in);
    private static OrderStorage orderStorage = new OrderStorage();
    private static ProductStorage productStorage = new ProductStorage();
    private static UserStorage userStorage = new UserStorage();
    private static ProductType productType;
    private static UserType userType;
    private static OrderStatus orderStatus;
    private static PaymentMethod paymentMethod;


    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
           Menu.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case Menu.LOGOUT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Invalid email or password: Please try again: ");
            }

        }
    }
    private static void register() {
        System.out.println("Please input User id: ");
        String userId = scanner.nextLine();
        System.out.println("Please input password: ");
        String password = scanner.nextLine();
        userStorage.register(userId);
        boolean isRun = true;
        while (isRun){
            Admin.printLoginCommands();
            String command = scanner.nextLine();
            switch (command){
                case Admin.LOGOUT:
                    isRun = false;
                    break;
                case PRINT_ALL_PRODUCTS:
                    printAllProducts();
                    break;
                case BUY_PRODUCT:
                    buyProduct();
                    break;
                case PRINT_MY_ORDERS:
                    printMyOrders();
                    break;
                case CANCEL_ORDER_BY_ID:
                    cancelOrderById();
                    break;
                default:
                    System.out.println("Invalid email or password: Please try again! ");
            }
        }
    }

    private static void cancelOrderById() {
    }

    private static void printMyOrders() {

    }

    private static void buyProduct() {

    }

    private static void printAllProducts() {

    }

    private static void login() {
        System.out.println("Please input email: ");
        String email = scanner.nextLine();
        System.out.println("Please input password: ");
        String password = scanner.nextLine();
        userStorage.login("admin@gmail.com", "admin1996");
        boolean isRun = true;
        while (isRun){
            Admin.printLoginCommands();
            String command = scanner.nextLine();
            switch (command){
                case Admin.LOGOUT:
                    isRun = false;
                    break;
                case ADD_PRODUCT:
                    addProduct();
                    break;
                case REMOVE_PRODUCT_BY_ID:
                    removeProductById();
                    break;
                case PRINT_PRODUCTS:
                    printProducts();
                    break;
                case PRINT_USERS:
                    printUsers();
                    break;
                case PRINT_ORDERS:
                    printOrders();
                    break;
                case CHANGE_ORDER_STATUS:
                     changeOrderStatus();
                    break;
                default:
                    System.out.println("Wrong command! ");
            }
        }

    }

    private static void changeOrderStatus() {

    }

    private static void printOrders() {

    }

    private static void printUsers() {


    }

    private static void printProducts() {


    }

    private static void removeProductById() {


    }

    private static void addProduct() {
        System.out.println("Please input Product id: ");
        productStorage.print();
        String productId = scanner.nextLine();
        Product productById = productStorage.getById(productId);
        if(productById == null ){
            System.out.println("Product name: ");
            String productName = scanner.nextLine();
            System.out.println("Product description: ");
            String productDescription = scanner.nextLine();
            System.out.println("Product price: ");
            int productPrice = Integer.parseInt(scanner.nextLine());
            System.out.println("Product stockQty");
            int productStockQty = Integer.parseInt(scanner.nextLine());

        }
    }

}















