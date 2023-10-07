package mycode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProgramStorage {

    private Program[] programs = new Program[100];
    private int size;
    Scanner scanner = new Scanner(System.in);

    public void add(Program program) {
        if (size == programs.length) {
            extend();
        }
        programs[size++] = program;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(programs[i]);
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
            if (tmp.equals(programs[i].getPersonalId())) {
                programs[i] = programs[i + 1];
            }
            size--;
        }
        System.out.println("Personal Id " + tmp + " delected!");
    }

    public void changeProgramByPersonalId(String tmp) {
        for (int i = 0; i < size; i++) {
            if(tmp.equals(programs[i].getPersonalId())) {
                System.out.println("Please edit your Username: ");
                programs[i].setUsername(scanner.nextLine());
                System.out.println("Please edit your UserID: ");
                programs[i].setUserId(scanner.nextLine());
                System.out.println("Please edit your Name: ");
                programs[i].setName(scanner.nextLine());
                System.out.println("Please edit your Surname: ");
                programs[i].setSurname(scanner.nextLine());
                System.out.println("Please edit your Gender: " +
                        "Male:" + " " + "Female:");
                programs[i].setGender(scanner.nextLine());
                System.out.println("Please edit your Date Of Birth: ");
                programs[i].setDateofbirth(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please edit your Personal ID: ");
                programs[i].setPersonalId(Double.parseDouble(scanner.nextLine()));
                System.out.println("Please edit your Country: ");
                programs[i].setCountry(scanner.nextLine());
                System.out.println("Please edit your Address: ");
                programs[i].setAddress(scanner.nextLine());
                System.out.println("Please edit your Email: ");
                programs[i].setEmail(scanner.nextLine());
                System.out.println("Please edit your Phone Number: ");
                programs[i].setPhoneNumber(Double.parseDouble(scanner.nextLine()));
                break;
            }
        }
        System.out.println("Persoanl ID " + tmp + " Changed");
    }

    private void extend() {
        Program[] TempArray = new Program[programs.length + 100];
        System.arraycopy(programs, 0, TempArray, 0, programs.length);
        programs = TempArray;
    }
}


