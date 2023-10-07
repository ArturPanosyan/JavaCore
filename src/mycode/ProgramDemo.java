package mycode;

import java.util.Scanner;

public class ProgramDemo {

    static Scanner scanner = new Scanner(System.in);
    static ProgramStorage programStorage = new ProgramStorage();


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
                    addInformation();
                    break;
                case "2":
                    printAllInformation();
                    break;
                case "3":
                    searchByemail();
                    break;
                case "4":
                    searchByUsername();
                    break;
                case "5":
                    searchByPhoneNumber();
                    break;
                case "6":
                    changeProgramByPersonalID();
                    break;
                    case "7":
                    deleteByPersonalID();
                    break;
                default:
                    System.out.println(" Invalid command: Try again! ");
                    break;

            }

        }
    }

    private static void addInformation() {
        System.out.println("Enter your Username: ");
        String Username = scanner.nextLine();
        System.out.println("Enter your UserID: ");
        String UserID = scanner.nextLine();
        System.out.println("Enter your Name: ");
        String Name = scanner.nextLine();
        System.out.println("Enter your Surname: ");
        String Surname = scanner.nextLine();
        System.out.println("Enter your Gender: ");
        String Gender = scanner.nextLine();
        System.out.println("Enter your Date Of Birth: ");
        double DateofBirth = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter your Personal ID: ");
        String PersonalID = scanner.nextLine();
        System.out.println("Enter your Country: ");
        String Country = scanner.nextLine();
        System.out.println("Enter your Address: ");
        String Address = scanner.nextLine();
        System.out.println("Enter your Email: ");
        String Email = scanner.nextLine();
        System.out.println("Enter your Phone Number: ");
        double PhoneNumber = Double.parseDouble(scanner.nextLine());
        Program program = new Program();
        programStorage.add(program);
    }
}

    private static void searchByUsername() {
        System.out.println("Please input Username");
        String keywordByUsername = scanner.nextLine();
        programStorage.searchUsername(keywordByUsername);
    }

    private static void searchByemail() {
        System.out.println("Please input EmployeeID");
        String keywordByEmail = scanner.nextLine();
        programStorage.searchByemail(keywordByEmail);
    }


    private static void searchByPhoneNumber() {
        System.out.println("Please input PhoneNumber");
        String keywordPhoneNumber = scanner.nextLine();
        programStorage.searchPhoneNumber(keywordPhoneNumber);
    }


    private static void printAllInformation() {
        System.out.println("--------------------");
        programStorage.print();
        System.out.println("--------------------");
    }

    private static void printCommands() {
        System.out.println("""
                PLEASE INPUT 0 FOR Exit
                        PLEASE INPUT 1 FOR ADD PROGRAM
                        PLEASE INPUT 2 FOR PRINT ALL PROGRAM
                        PLEASE INPUT 3 FOR SEARCH PROGRAM BY EMAIL
                        PLEASE INPUT 4 FOR SEARCH BY PHONE NUMBER
                        PLEASE INPUT 5 FOR SEARCH USERNAME
                        PLEASE INPUT 6 FOR CHANGE
                        PLEASE INPUT 7 FOR DELETE BY PERSONAL ID
                        
                """);
    }


    private static void changeProgramByPersonalID() {
        System.out.println("Please input Personal ID of the Program to Edit");
        String tmp = scanner.nextLine();
        programStorage.changeProgramByPersonalId(tmp);
    }

    private static void deleteByPersonalID() {
        System.out.println("Enter the Personal ID to delete:");
        String tmp = scanner.nextLine();
        programStorage.deleteByPersonalId(tmp);
    }

