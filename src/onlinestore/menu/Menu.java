package onlinestore.menu;

public interface Menu {

    String LOGIN = "0";
    String REGISTER = "1";

    static void printCommands() {
        System.out.println("Please input " + 0 + " for LOGIN: ");
        System.out.println("Please input " + 1 + " for REGISTER: ");
    }
}
