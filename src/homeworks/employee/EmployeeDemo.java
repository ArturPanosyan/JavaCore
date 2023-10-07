package homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addInformation();
                    break;
                case "2":
                    printAllInformation();
                    break;
                case "3":
                    searchEmployeeId();
                    break;
                case "4":
                    searchByCompanyName();
                    break;
                case "5":
                    searchByPhoneNumber();
                    break;
                case "6":
                   deleteById();
                   break;
                case "7":
                    changeEmployeeById();
                    break;
                default:
                    System.out.println(" Invalid command: Try again! ");
                    break;

            }
        }
    }

    private static void searchByCompanyName() {
        System.out.println("Please input Company Name");
        String keywordCompany = scanner.nextLine();
        employeeStorage.searchByCompany(keywordCompany);
    }

    private static void searchEmployeeId() {
        System.out.println("Please input EmployeeID");
        String keywordID = scanner.nextLine();
        employeeStorage.searchByID(keywordID);
    }
    private static void searchByPhoneNumber() {
        System.out.println("Please input PhoneNumber");
        String keywordPhoneNumber = scanner.nextLine();
        employeeStorage.searchByCompany(keywordPhoneNumber);
    }
    private static void printAllInformation() {
        System.out.println("--------------------");
        employeeStorage.print();
        System.out.println("--------------------");
    }
    private static void addInformation() {
        System.out.println("ENTER YOUR NAME");
        String name = scanner.nextLine();
        System.out.println("ENTER YOUR SURNAME");
        String surname = scanner.nextLine();
        System.out.println("ENTER YOUR EMPLOYEEID");
        String employeeID = scanner.nextLine();
        System.out.println("ENTER YOUR PHONENUMBER");
        double phoneNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("ENTER THE YOUR COMPANY NAME");
        String companyName = scanner.nextLine();
        System.out.println("ENTER THE YOUR POSITION IN COMPANY");
        String position = scanner.nextLine();
        System.out.println("ENTER YOUR SALARY");
        double salary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(name, surname, employeeID, phoneNumber, salary, companyName, position);
        employeeStorage.add(employee);
    }
    private static void printCommands() {
        System.out.println("""
                        PLEASE INPUT 0 FOR Exit
                        PLEASE INPUT 1 FOR ADD EMPLOYEE
                        PLEASE INPUT 2 FOR PRINT ALL EMPLOYEE
                        PLEASE INPUT 3 FOR SEARCH EMPLOYEE BY EMPLOYEE ID
                        PLEASE INPUT 4 FOR SEARCH BY COMPANY NAME
                        PLEASE INPUT 5 FOR SEARCH EMPLOYEE PHONE
                        PLEASE INPUT 6 FOR DELETE BY ID
                        PLEASE INPUT 7 FOR CHANGE """);


    }
     private static void deleteById() {
        System.out.println("Enter the ID to delete:");
        String tmp = scanner.nextLine();
        employeeStorage.deleteById(tmp);
    }
private static void changeEmployeeById() {
    System.out.println("PLEASE INPUT ID OF THE EMPLOYEE TO EDIT");
    String tmp = scanner.nextLine();
    employeeStorage.changeEmployeeById(tmp);
}
}


