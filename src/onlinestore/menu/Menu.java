package onlinestore.menu;

public interface Menu {

   String LOGIN = "0";
   String REGISTER = "1";
   String LOGOUT = "2";

   static void printCommands() {
       System.out.println("Please input " + LOGIN + " for LOGIN: ");
       System.out.println("Please input " + REGISTER + " for REGISTER: ");
       System.out.println("Please input " + LOGOUT + " for LOGOUT: ");
   }
}