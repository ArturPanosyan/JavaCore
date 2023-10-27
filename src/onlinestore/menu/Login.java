package onlinestore.menu;

public interface Login {

    String LOGOUT = "0";
    String ADD_PRODUCT = "1";
    String REMOVE_PRODUCT_BY_ID = "2";
    String PRINT_PRODUCTS = "3";
    String PRINT_USERS = "4";
    String PRINT_ORDERS = "5";
    String CHANGE_ORDER_STATUS = "6";


    static  void LoginCommands(){
        System.out.println("Please input " + 0 + " for LOGOUT: ");
        System.out.println("Please input " + 1 + " for ADD_PRODUCT: ");
        System.out.println("Please input " + 2 + " for REMOVE_PRODUCT_BY_ID: ");
        System.out.println("Please input " + 3 + " for PRINT_PRODUCTS: ");
        System.out.println("Please input " + 4 + " for PRINT_USERS: ");
        System.out.println("Please input " + 5 + " for PRINT_ORDERS: ");
        System.out.println("Please input " + 6 + " for CHANGE_ORDER_STATUS: ");
    }
}
