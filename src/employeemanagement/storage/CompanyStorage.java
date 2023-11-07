package employeemanagement.storage;

import employeemanagement.model.Company;
import employeemanagement.util.StorageSerializeUtil;

import java.io.Serializable;

public class CompanyStorage implements Serializable {

    private Company[] companies = new Company[10];
    private int size;

    public void add(Company company) {
        if (size == companies.length) {
            extend();
        }
        companies[size++] = company;
        StorageSerializeUtil.serializeCompanyStorage(this);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }

    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
        companies = tmp;
    }

    public Company getById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(companyId)) {
                return companies[i];
            }
        }
        return null;
    }

    public void deleteById(String companyId) {
        int indexById = getIndexById(companyId);
        if (indexById == -1) {
            System.out.println("Company does not exists!");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            companies[i - 1] = companies[i];
        }
        size--;
        StorageSerializeUtil.serializeCompanyStorage(this);
    }

    private int getIndexById(String companyId) {
        for (int i = 0; i < size; i++) {
            if (companies[i].getId().equals(companyId)) {
                return i;
            }
        }
        return -1;
    }
}