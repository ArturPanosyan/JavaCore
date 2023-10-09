package mycode;

import java.util.Scanner;

public class PersonalStorage {

    private Personal[] personals = new Personal[100];
    private int size;
    Scanner scanner = new Scanner(System.in);

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
        if (!Username.contains("PersonalId") || !Username.contains("name")) {
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

    public void changeProgramByPersonalId(String tmp) {
        for (int i = 0; i < size; i++) {
            if(tmp.equals(personals[i].getPersonalId())) {
                System.out.println("Please edit your Username: ");
                personals[i].setUsername(scanner.nextLine());
                System.out.println("Please edit your UserID: ");
                personals[i].setUserId(scanner.nextLine());
                System.out.println("Please edit your Name: ");
                personals[i].setName(scanner.nextLine());
                System.out.println("Please edit your Surname: ");
                personals[i].setSurname(scanner.nextLine());
                System.out.println("Please edit your Gender: " +
                        "Male:" + " " + "Female:");
                personals[i].setGender(scanner.nextLine());
                System.out.println("Please edit your Date Of Birth: ");
                personals[i].setDateofbirth(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please edit your Personal ID: ");
                personals[i].setPersonalId(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please edit your Country: ");
                personals[i].setCountry(scanner.nextLine());
                System.out.println("Please edit your Address: ");
                personals[i].setAddress(scanner.nextLine());
                System.out.println("Please edit your Email: ");
                personals[i].setEmail(scanner.nextLine());
                System.out.println("Please edit your Phone Number: ");
                personals[i].setPhone(Double.parseDouble(scanner.nextLine()));
            }
        }
        System.out.println("Persoanl ID " + tmp + " Changed");
    }

    private void extend() {
        Personal[] TempArray = new Personal[personals.length + 100];
        System.arraycopy(personals, 0, TempArray, 0, personals.length);
        personals = TempArray;
    }

    public Personal getByID(String personalId) {

        for (int i = 0; i < size; i++) {
            if(personals[i].getUserId().equals(personalId)){
                return  personals[i];
            }
        }
        return  null;
    }

    public void deleteById(String personalID) {

    }

    public void searchPersonalByCompany(Company companyFromStorage) {
        for (int i = 0; i < size; i++) {
            if(personals[i].getCompany().equals(companyFromStorage));
            System.out.println(personals[i]);
        }
    }
}


