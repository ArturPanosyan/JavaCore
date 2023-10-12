package mycode;

public class PersonalStorage {

    private Personal[] personals = new Personal[100];
    private int size;

    public void add(Personal personal) {
        if (size == personals.length) {
            extend();
        }
        personals[size++] = personal;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(personals[i]);
        }
    }

    public boolean searchByemail(String email) {
        boolean isValidEmail = true;
        if (!email.contains("@") || !email.contains("gmail") || !email.contains(".com")) {
            System.out.println("Invalid email: Please try again");
            isValidEmail = false;
        }

        return isValidEmail;
    }

    public boolean searchPhoneNumber(String phoneNumber) {
        boolean isValidPhoneNumber = true;
        if (!phoneNumber.startsWith("+") && phoneNumber.length() != 374) {
            System.out.println("Invalid phone Number: Please try again");
            isValidPhoneNumber = false;
        }
        return isValidPhoneNumber;
    }


    public boolean searchUsername(String Username) {
        boolean isValidUsername = true;
        if (!Username.contains("PersonalId") || !Username.contains("Username")) {
            System.out.println("Please for username...");
            isValidUsername = false;
        }
        return isValidUsername;
    }


    public void deleteByPersonalId(String tmp) {
        for (int i = 0; i < size; i++) {
            if (tmp.equals(personals[i].getPersonalId())) {
                personals[i] = personals[i + 1];
            }
            size--;
        }
        System.out.println("Personal Id " + tmp + " delected!");
    }



    private void extend() {
        Personal[] TempArray = new Personal[personals.length + 100];
        System.arraycopy(personals, 0, TempArray, 0, personals.length);
        personals = TempArray;
    }

    public int getindexBYId(String personalId) {
        for (int i = 0; i < size; i++) {
            if(personals[i].getUserId().equals(personalId)){
                return i;
            }
        }
        return  -1;
    }

    public void deleteById(String personalId) {
        int indexById = getindexBYId(personalId);
        if(indexById == -1) {
            System.out.println("PersonalID does not exists!!! ");
            return;
        }
        for (int i = indexById + 1; i < size; i++) {
            personals[i - 1] = personals[i];
        }
        size--;
    }

    public void searchPersonalByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if(personals[i].getCompany().equals(companyFromStorage));
            System.out.println(personals[i]);
        }
    }

    public Personal getByID(String personalID) {
        for (int i = 0; i < size; i++) {
            if(personals[i].getUserId().equals(personalID)){
                return personals[i];
            }
        }
   return null;
    }


}


