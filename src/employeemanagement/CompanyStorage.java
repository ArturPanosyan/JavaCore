package employeemanagement;

public class CompanyStorage {

    private  Company[] companies = new Company[10];
    private  int size;

    public  void add(Company company){
        if(size == companies.length){
            extend();
        }
        companies[size++] = company;
    }

    public  void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(companies[i]);
        }
    }


    private void extend() {
        Company[] tmp = new Company[companies.length + 10];
        System.arraycopy(companies, 0, tmp, 0, companies.length);
        companies = tmp;
    }


    public Company getBYId(String companyId) {
        for (int i = 0; i < size; i++) {
            if(companies[i].getId().equals(companyId)){
                return companies[i];
            }
        }
        return  null;
    }

    public void deleteById(String companyID) {
        int indexById = getindexBYId(companyID);
        if(indexById == -1) {
            System.out.println(" Company does not exists!!! ");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            companies[i - 1] = companies[i];
        }
    size--;
    }

    private int getindexBYId(String companyID) {
        for (int i = 0; i < size; i++) {
            if(companies[i].getId().equals(companyID)){
                return  i;
            }
        }
   return  - 1;
    }


}
