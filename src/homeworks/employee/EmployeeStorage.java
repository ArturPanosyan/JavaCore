package homeworks.employee;

import classwork.classwork.library.Book;

public class EmployeeStorage {
    private Employee[] employees = new Employee[50];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " "
            + employees[i].getEmployeeID() + " " + employees[i].getPhone() + " " +
                    employees[i].getCompany() + " " + employees[i].getPosition());


        }
    }
public void search(String keyword) {
    for (int i = 0; i < size; i++) {
        if(employees[i].getEmployeeID().contains(keyword) || employees[i].getCompany().contains(keyword));
        System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " "
                + employees[i].getEmployeeID() + " " + employees[i].getPhone() + " " +
                employees[i].getCompany() + " " + employees[i].getPosition());
    }

}

    private void extend() {
        Employee[] TempArray =new Employee[employees.length + 10];
                System.arraycopy(employees,0, TempArray, 0 , employees.length);
                employees = TempArray;
        }
    }

