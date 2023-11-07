package classwork.chapter7;

public class StringExample {
    public static void main(String[] args) {
        String fullName = "Poxos Poxosyan Poxosi";

        String[] fullNameArray = fullName.split(" ");
        if (fullNameArray.length == 3) {
            String name = fullNameArray[0];
            String surname = fullNameArray[1];
            String middleName = fullNameArray[2];

            System.out.println(name);
            System.out.println(surname);
            System.out.println(middleName);
        }
    }
}
