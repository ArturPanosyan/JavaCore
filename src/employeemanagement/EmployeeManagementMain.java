package employeemanagement;

import employeemanagement.exception.ModelNotFoundException;
import employeemanagement.model.Company;
import employeemanagement.model.Employee;
import employeemanagement.storage.CompanyStorage;
import employeemanagement.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeManagementMain {

    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();

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
                    addCompany();
                    break;
                case "2":
                    addEmployee();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    employeeStorage.print();
                    break;
                case "5":
                    searchEmployeeById();
                    break;
                case "6":
                    searchEmployeeByCompany();
                    break;
                case "7":
                    deleteCompany();
                    break;
                case "8":
                    deleteEmployee();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changeEmployee();
                    break;
                default:
                    System.out.println("invalid command: Try again!");
                    break;
            }

        }
    }

    private static void changeEmployee() {
        System.out.println("Please choose company ID: ");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyID);
        if (companyFromStorage == null) {
            System.out.println(" Company with " + companyID + "does not exists!!! ");
            return;
        }
        employeeStorage.searchEmployessByCompany(companyFromStorage);
        System.out.println("Please input employee ID: ");
        String employeeID = scanner.nextLine();
        try {
            Employee employeeFromStorage = employeeStorage.getByID(employeeID);
            System.out.println("Please input Employee Name: ");
            String employeeName = scanner.nextLine();
            System.out.println("Please input Employee Surname: ");
            String employeeSurname = scanner.nextLine();
            System.out.println("Please input Employee Phone: ");
            String employeePhone = scanner.nextLine();
            System.out.println("Please input Employee Position: ");
            String employeePosition = scanner.nextLine();
            System.out.println("Please input Employee Salary USD: ");
            double employeeSalary = Double.parseDouble(scanner.nextLine());
            employeeFromStorage.setName(employeeName);
            employeeFromStorage.setSurname(employeeSurname);
            employeeFromStorage.setPosition(employeePosition);
            employeeFromStorage.setSalary(employeeSalary);
            employeeFromStorage.setPhone(employeePhone);
            System.out.println("Employee Updated! ");
        } catch (ModelNotFoundException m) {
            System.out.println(m.getMessage());
        }
    }

    private static void changeCompany() {
        System.out.println("Please input Company ID: ");
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + "does not exists!!! ");
            return;
        }
        System.out.println("Please input New Company Name: ");
        String companyName = scanner.nextLine();
        System.out.println("Please input New Company Address: ");
        String companyAddress = scanner.nextLine();
        companyFromStorage.setName(companyName);
        companyFromStorage.setAddress(companyAddress);
        System.out.println("Company Updated: ");
    }

    private static void deleteEmployee() {
        System.out.println("Please choose Company ID: ");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!! ");
            return;
        }
        employeeStorage.searchEmployessByCompany(companyFromStorage);

        System.out.println("Please input Employee ID: ");
        String employeeID = scanner.nextLine();
        try {
            Employee employeeFromStorage = employeeStorage.getByID(employeeID);
            if (!employeeFromStorage.getCompany().equals(companyFromStorage)) {
                System.out.println("Wrong employee ID: ");
                return;
            }
            employeeStorage.deleteById(employeeID);
        } catch (ModelNotFoundException m) {
            System.out.println(m.getMessage());
        }
    }

    private static void deleteCompany() {
        System.out.println("Please choose CompanyID: ");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyID);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyID + " does not exists!!!");
            return;
        }
        companyStorage.deleteById(companyID);

    }

    private static void searchEmployeeByCompany() {
        System.out.println("Please Choose Company ID");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!!");
            return;
        }
        employeeStorage.searchEmployessByCompany(companyFromStorage);
    }


    private static void searchEmployeeById() {
        System.out.println("Please input Employee ID");
        String employeeId = scanner.nextLine();
        try {
            System.out.println(employeeStorage.getByID(employeeId));
        } catch (ModelNotFoundException m){
            System.out.println(m.getMessage());
        }
    }
    private static void addEmployee() {
        System.out.println("Please Choose Company ID");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!!");
            return;
        }
        System.out.println("Please input Employee ID ");
        String employeeId = scanner.nextLine();
        boolean exists;
        try{
          employeeStorage.getByID(employeeId);
            exists = true;
        } catch (ModelNotFoundException m){
            exists = false;
        }
        if(!exists) {
        System.out.println(" Please input Employee Name: ");
        String employeeName = scanner.nextLine();
        System.out.println(" Please input Employee Surname: ");
        String employeeSurname = scanner.nextLine();
        System.out.println(" Please input Employee Phone: ");
        String employeePhone = scanner.nextLine();
        System.out.println(" Please input Employee Position:");
        String employeePosition = scanner.nextLine();
        System.out.println(" Please input Employee Salary USD: ");
        double employeeSalary = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(employeeId, employeeName, employeeSurname, employeePhone, employeeSalary, employeePosition, companyFromStorage);
        employeeStorage.add(employee);
        System.out.println("Employee Registered! ");
    }
        }

    private static void addCompany() {
        System.out.println("Plese input Company ID");
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage != null) {
            System.out.println("Company with " + companyId + " alredy exists!!!");
            return;
        }
        System.out.println("Please input Company Name ");
        String companyName = scanner.nextLine();
        System.out.println("Please input Company Address");
        String companyAddress = scanner.nextLine();
        Company company = new Company(companyId, companyName, companyAddress);
        companyStorage.add(company);
        System.out.println("Company Registered.! ");
    }

    private static void printCommands() {
        System.out.println("Please input 0 for Exit");
        System.out.println("Please input 1 for ADD_COMPANY");
        System.out.println("Please input 2 for ADD_EMPLOYEE");
        System.out.println("Please input 3 for PRINT_ALL_COMPANIES");
        System.out.println("Please input 4 for PRINT_ALL_EMPLOYEES");
        System.out.println("Please input 5 for SEARCH_EMPLOYEE_BY_ID");
        System.out.println("Please input 6 for SEARCH_EMPLOYEE_BY_COMPANY");
        System.out.println("Please input 7 for DELETE_COMPANY");
        System.out.println("Please input 8 for DELETE_EMPLOYEE");
        System.out.println("Please input 9 for CHANGE_COMPANY");
        System.out.println("Please input 10 for CHANGE_EMPLOYEE");
    }


}