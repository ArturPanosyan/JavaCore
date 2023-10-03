package homeworks.employee;

import java.sql.SQLOutput;
import java.util.Scanner;

    public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;
        while (isRun) {
            System.out.println("PLEASE INPUT FOR 0 Exit");
            System.out.println("PLEASE INPUT FOR 1 ADD EMPLOYEE");
            System.out.println("PLEASE INPUT FOR 2 PRINT ALL EMPLOYEE");
            System.out.println("PLEASE INPUT FOR 3 SEARCH EMPLOYEE BY EMPLOYEE ID");
            System.out.println("PLEASE INPUT FOR 4 SEARCH BY COMPANY NAME");
            System.out.println("PLEASE INPUT FOR 5 SEARCH EMPLOYEE PHONE");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.err.println("ENTER YOUR NAME");
                    String name = scanner.nextLine();
                    System.err.println("ENTER YOUR SURNAME");
                    String surname = scanner.nextLine();
                    System.err.println("ENTER YOUR EMPLOYEEID");
                    String employeeID = scanner.nextLine();
                    System.err.println("ENTER YOUR PHONENUMBER");
                    double phoneNumber = Double.parseDouble(scanner.nextLine());
                    System.err.println("ENTER THE YOUR COMPANY NAME");
                    String companyName = scanner.nextLine();
                    System.err.println("ENTER THE YOUR POSITION IN COMPANY");
                    String position = scanner.nextLine();
                    System.err.println("ENTER YOUR SALARY");
                    double salary = Double.parseDouble(scanner.nextLine());
                    Employee employee = new Employee(name, surname, employeeID, phoneNumber, salary, companyName, position);
                    employeeStorage.add(employee);
                    break;
                case "2":
                    System.err.println("--------------------");
                    employeeStorage.print();
                    System.out.println("--------------------");
                    break;
                case "3":
                    System.err.println("Please input EmployeeID");
                    String keywordID = scanner.nextLine();
                    employeeStorage.searchByID(keywordID);
                    break;
                case "4":
                    System.err.println("Please input Company Name");
                    String keywordCompany = scanner.nextLine();
                    employeeStorage.searchByCompany(keywordCompany);
                    break;
                default:
                    System.err.println(" Invalid command: Try again! ");
                    break;
            }


        }


    }
}


