package employeemanagement;

import employeemanagement.exception.EmployeeNotFoundException;
import employeemanagement.model.Company;
import employeemanagement.model.Employee;
import employeemanagement.storage.CompanyStorage;
import employeemanagement.storage.EmployeeStorage;
import employeemanagement.util.DateUtil;
import employeemanagement.util.StorageSerializeUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeManagementMain implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = StorageSerializeUtil.deserializeEmployeeStorage();
    private static CompanyStorage companyStorage = StorageSerializeUtil.deserializeCompanyStorage();

    // public static User currentUser = null;
    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Command.printLoginCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case LOGIN:
                    login();
                    break;
                case REGISTER:
                    register();
                    break;
                default:
                    System.out.println("Wrong command!");
            }
        }

    }

    private static void register() {
        //TODO
    }

    private static void login() {
        System.out.println("Please input email");
        String email = scanner.nextLine();
        System.out.println("Please input password");
        String password = scanner.nextLine();
        if (email.equals("admin@mail.com") && password.equals("1234")) {
            //currentUser =
            userCommands();
        } else {
            System.out.println("Invalid email or password. Please try again.");
        }
    }

    private static void userCommands() {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case LOGOUT:
                    isRun = false;
                    //currentUser = null;
                    break;
                case ADD_COMPANY:
                    addCompany();
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_COMPANIES:
                    companyStorage.print();
                    break;
                case PRINT_EMPLOYEES:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY:
                    searchEmployeeByCompany();
                    break;
                case DELETE_COMPANY:
                    deleteCompany();
                    break;
                case DELETE_EMPLOYEE:
                    deleteEmployee();
                    break;
                case CHANGE_COMPANY:
                    changeCompany();
                    break;
                case CHANGE_EMPLOYEE:
                    changeEmployee();
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }
    }

    private static void changeEmployee() {
        System.out.println("Please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        try {
            Employee employeeFromStorage = employeeStorage.getById(employeeId);
            System.out.println("please input employee name");
            String employeeName = scanner.nextLine();
            System.out.println("please input employee surname");
            String employeeSurname = scanner.nextLine();
            System.out.println("please input employee phone");
            String employeePhone = scanner.nextLine();
            System.out.println("please input employee position");
            String employeePosition = scanner.nextLine();
            System.out.println("please input employee salary AMD");
            double employeeSalary = Double.parseDouble(scanner.nextLine());
            employeeFromStorage.setName(employeeName);
            employeeFromStorage.setSurname(employeeSurname);
            employeeFromStorage.setPosition(employeePosition);
            employeeFromStorage.setSalary(employeeSalary);
            employeeFromStorage.setPhone(employeePhone);
            System.out.println("Employee updated!");

            StorageSerializeUtil.serializeEmployeeStorage(employeeStorage);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Wrong salary, please input only numbers!");
        }

    }

    private static void changeCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!!");
            return;
        }
        System.out.println("please input new company name");
        String companyName = scanner.nextLine();
        System.out.println("please input new company address");
        String companyAddress = scanner.nextLine();
        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddress);
        System.out.println("company updated");
        StorageSerializeUtil.serializeCompanyStorage(companyStorage);
    }

    private static void deleteEmployee() {
        System.out.println("Please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);

        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        try {
            Employee employeeFromStorage = employeeStorage.getById(employeeId);
            if (!employeeFromStorage.getCompany().equals(companyFromStorage)) {
                System.out.println("Wrong employee id.");
                return;
            }
            employeeStorage.deleteById(employeeId);
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteCompany() {
        System.out.println("Please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        companyStorage.deleteById(companyId);
        StorageSerializeUtil.serializeCompanyStorage(companyStorage);
    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployeesByCompany(companyFromStorage);
    }

    private static void searchEmployeeById() {
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        try {
            System.out.println(employeeStorage.getById(employeeId));
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void addEmployee() {
        System.out.println("Please choose company id");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage == null) {
            System.out.println("company with " + companyId + " does not exists!!!");
            return;
        }
        System.out.println("please input employee id");
        String employeeId = scanner.nextLine();
        boolean exists;
        try {
            employeeStorage.getById(employeeId);
            exists = true;
        } catch (EmployeeNotFoundException e) {
            exists = false;
        }
        if (!exists) {
            System.out.println("please input employee name");
            String employeeName = scanner.nextLine();
            System.out.println("please input employee surname");
            String employeeSurname = scanner.nextLine();
            System.out.println("please input employee phone");
            String employeePhone = scanner.nextLine();
            System.out.println("please input employee position");
            String employeePosition = scanner.nextLine();
            System.out.println("please input employee salary AMD");
            double employeeSalary = Double.parseDouble(scanner.nextLine());
            System.out.println("please input employee date of birthday (dd-MM-yyyy)");
            String dateOfBirthdayStr = scanner.nextLine();
            Date dateOfBirthday = null;
            try {
                dateOfBirthday = DateUtil.stringToDate(dateOfBirthdayStr);
            } catch (ParseException ex) {
                System.out.println("dateOfBirthday is incorrect!");
            }
            Date registerDate = new Date();
            Employee employee = new Employee(employeeId, employeeName, employeeSurname,
                    employeePhone, employeeSalary, employeePosition,
                    companyFromStorage, dateOfBirthday, registerDate);
            // employee.setUser(currentUser);
            employeeStorage.add(employee);
            System.out.println("Employee registered!");
        } else {
            System.out.println("Employee already exists!");
        }
    }


    private static void addCompany() {
        System.out.println("please input company id");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getById(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " already exists!!!");
            return;
        }

        System.out.println("please input company name");
        String companyName = scanner.nextLine();
        System.out.println("please input company address");
        String companyAddress = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress);
        companyStorage.add(company);
        System.out.println("company registered.");
    }
}