package employeemanagement.storage;

import employeemanagement.exception.ModelNotFoundException;
import employeemanagement.model.Company;
import employeemanagement.model.Employee;

public class EmployeeStorage {
    
    private  Employee[] employees = new Employee[10];
    private  int size;
    
    public  void add(Employee employee){
        if(size == employees.length){
            extend();
        }
        employees[size++] = employee;
    }

    public  void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
    
    
    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }


    public Employee getByID(String employeeId) throws ModelNotFoundException {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId().equals(employeeId)){
                return  employees[i];
            }
        }
       throw new ModelNotFoundException ("Employe with " + employeeId + " does not exists!!!");

    }

    public void searchEmployessByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getCompany().equals(companyFromStorage));
            System.out.println(employees[i]);
        }
    }


    public void deleteById(String companyID) {
        int indexById = getindexBYId(companyID);
        if(indexById == -1) {
            System.out.println(" Employee does not exists!!! ");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            employees[i - 1] = employees[i];
        }
        size--;
    }

    private int getindexBYId(String companyID) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId().equals(companyID)){
                return  i;
            }
        }
        return  - 1;
    }
    }

