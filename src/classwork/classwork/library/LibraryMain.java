package classwork.classwork.library;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStorage bookStorage = new BookStorage();
        boolean isRun = true;
        while(isRun) {
            System.out.println("Please input for 0 Exit");
            System.out.println("Please input for 1 Add Book");
            System.out.println("Please input for 2 Search Book");
            System.out.println("Please input for 3 Print All Books");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input book title");
                    String title = scanner.nextLine();
                    System.out.println("Please input author name");
                    String authorName = scanner.nextLine();
                    System.out.println("Please input price");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.println("Please input count");
                    int count = Integer.parseInt(scanner.nextLine());
                    Book book = new Book(title, authorName, price, count);
                    bookStorage.add(book);
                    break;
                case "2":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    bookStorage.search(keyword);
                    break;
                case "3":
                    System.out.println("--------------------");
                    bookStorage.print();
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println(" Invalid command: Try again! ");
            }
        }

    }

}
