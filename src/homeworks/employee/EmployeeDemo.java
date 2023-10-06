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
        System.out.println("PLEASE INPUT FOR 0 Exit");
        System.out.println("PLEASE INPUT FOR 1 ADD EMPLOYEE");
        System.out.println("PLEASE INPUT FOR 2 PRINT ALL EMPLOYEE");
        System.out.println("PLEASE INPUT FOR 3 SEARCH EMPLOYEE BY EMPLOYEE ID");
        System.out.println("PLEASE INPUT FOR 4 SEARCH BY COMPANY NAME");
        System.out.println("PLEASE INPUT FOR 5 SEARCH EMPLOYEE PHONE");

    }

}


