package onlinestore;

import jdk.jfr.Registered;
import onlinestore.menu.Login;
import onlinestore.menu.Menu;
import onlinestore.menu.User;
import onlinestore.order.OrderStatus;
import onlinestore.order.PaymentMethod;
import onlinestore.product.ProductType;
import onlinestore.storage.OrderStorage;
import onlinestore.storage.ProductStorage;
import onlinestore.storage.UserStorage;
import onlinestore.user.UserType;

import java.io.IOException;
import java.util.Scanner;


public class OnlineStoreMain  implements Login, Menu, User {

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
            System.out.println("Выберите нужный пункт: ");
            String menu = scanner.nextLine();
            switch (menu) {
                case REGISTER:
                    register();
                   userStorage.add(new onlinestore.user.User());
                    break;
                case LOGIN:

                    break;
                case
            }
        }
    }












}
