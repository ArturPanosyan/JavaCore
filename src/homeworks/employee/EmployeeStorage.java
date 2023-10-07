package homeworks.employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeStorage {
    private Employee[] employees = new Employee[50];
    private int size;
    Scanner scanner = new Scanner(System.in);

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
    public void searchByID(String keywordID) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeID().contains(keywordID)) ;
            System.out.println(employees[i]);
        }
    }
    public void searchByCompany(String keywordByCompany) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(keywordByCompany)) ;
            System.out.println(employees[i]);
        }
    }

    public void searchByPhoneNumber(double keywordByPhoneNumber) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getPhone() == keywordByPhoneNumber) {
                System.out.println(employees[i]);
            }
        }
    }
        private void extend () {
            Employee[] TempArray = new Employee[employees.length + 10];
            System.arraycopy(employees, 0, TempArray, 0, employees.length);
            employees = TempArray;
        }
        public void deleteById (String tmp) {
            for (int i = 0; i < size; i++) {
                if (tmp.equals(employees[i].getEmployeeID())) {
                    employees[i] = employees[i + 1];
                }
                size--;
            }
            System.out.println("Employess " + tmp + " delected!");
        }

        public void changeEmployeeById (String tmp){
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    if (tmp.equals(employees[i].getEmployeeID())) {
                        System.out.println("PlEASE EDIT EMPLOYESS NAME");
                        employees[i].setName(scanner.nextLine());
                        System.out.println("PlEASE EDIT EMPLOYESS SURNAME");
                        employees[i].setSurname(scanner.nextLine());
                        System.out.println("PlEASE EDIT EMPLOYESS COMPANY");
                        employees[i].setCompany(scanner.nextLine());
                        System.out.println("PlEASE EDIT EMPLOYESS POSITION");
                        employees[i].setPosition(scanner.nextLine());
                        System.out.println("PlEASE EDIT EMPLOYESS SALARY");
                        employees[i].setSalary(Double.parseDouble(scanner.nextLine()));
                        break;
                    }
                }
            }
            System.out.println("Employee " + tmp + " changed");
        }

    }