package mycode;

import java.util.Scanner;

public class PersonalDemo {

    static Scanner scanner = new Scanner(System.in);
    static PersonalStorage personalStorage = new PersonalStorage();
    static CompanyStorage companyStorage = new CompanyStorage();


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
                    addPersonal();
                    break;
                case "3":
                    companyStorage.print();
                    break;
                case "4":
                    personalStorage.print();
                    break;
                case "5":
                    searchPersonalById();
                    break;
                case "6":
                    searchPersonalByCompany();
                    break;
                case "7":
                    deleteCompany();
                    break;
                case "8":
                    deletePersonal();
                    break;
                case "9":
                    changeCompany();
                    break;
                case "10":
                    changePersonal();
                    break;
                default:
                    System.out.println("invalid command: Try again!");
                    break;
            }

        }
    }

    private static void changePersonal() {
        System.out.println("Please choose company ID: ");
        companyStorage.print();
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyID);
        if(companyFromStorage == null) {
            System.out.println(" Company with " + companyID + "does not exists!!! ");
            return;
        }
        personalStorage.searchPersonalByCompany(companyFromStorage);
        System.out.println("Please input personal ID: ");
        String personalID = scanner.nextLine();
        Personal personalFromStorage = personalStorage.getByID(personalID);
        if(personalFromStorage == null) {
            System.out.println("Personal with " + personalID + "ID does not exists!!! ");
            return;
        }
        System.out.println("Please input Personal Name: ");
        String personalName = scanner.nextLine();
        System.out.println("Please input Personal Surname: ");
        String personalSurname = scanner.nextLine();
        System.out.println("Please input Personal Phone: ");
        String personalPhone = scanner.nextLine();
        System.out.println("Please input Personal Email: ");
        String personalEmail = scanner.nextLine();
        personalFromStorage.setName(personalName);
        personalFromStorage.setSurname(personalSurname);
        personalFromStorage.setPhone(Double.parseDouble(personalPhone));
        personalFromStorage.setEmail(personalEmail);

        System.out.println ("Personal Updated! ");
    }

    private static void changeCompany() {
        System.out.println("Please input Company ID: ");
        String companyID = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyID);
        if(companyFromStorage == null) {
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

    private static void deletePersonal() {
        System.out.println("Please choose Company ID: ");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if(companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!! ");
            return;
        }
        personalStorage.searchPersonalByCompany(companyFromStorage);

        System.out.println("Please input Personal ID: ");
        String personalID = scanner.nextLine();
        Personal personalFromStorage = personalStorage.getByID(personalID);
        if(personalFromStorage == null) {
            System.out.println("Personal does not exists!!! ");
            return;
        }
        if(!personalFromStorage.getCompany().equals(companyFromStorage)) {
            System.out.println("Wrong personal ID: ");
            return;
        }
        personalStorage.deleteById(personalID);
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

    private static void searchPersonalByCompany() {
        System.out.println("Please Choose Company ID");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!!");
            return;
        }
        personalStorage.searchPersonalByCompany(companyFromStorage);
    }


    private static void searchPersonalById() {
        System.out.println("Please input Personal ID");
        String personalId = scanner.nextLine();
        Personal byId = personalStorage.getByID(personalId);
        if(byId == null){
            System.out.println("Personal does not exists!!");
        } else{
            System.out.println(byId);
        }
    }

    private static void addPersonal() {
        System.out.println("Please Choose Company ID");
        companyStorage.print();
        String companyId = scanner.nextLine();
        Company companyFromStorage = companyStorage.getBYId(companyId);
        if (companyFromStorage == null) {
            System.out.println("Company with " + companyId + " does not exists!!!");
            return;
        }
        System.out.println("Please input Personal ID ");
        String personalId = scanner.nextLine();
        Personal personalFromStorage = personalStorage.getByID(personalId);
        if(personalFromStorage != null){
            System.out.println("Personal with " + personalId + "ID already exists!!!");
            return;
        }
        System.out.println(" Please input Personal Name: ");
        String personalName = scanner.nextLine();
        System.out.println(" Please input Personal Surname: ");
        String personalSurname = scanner.nextLine();
        System.out.println(" Please input date of birth: ");
        double personaldateofbirth = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input Personal Country: ");
        String personalCountry = scanner.nextLine();
        System.out.println("Please input Personal Address: ");
        String personalAddress = scanner.nextLine();
        System.out.println("Please input Personal Email: ");
        String personalEmail = scanner.nextLine();
        System.out.println(" Please input Personal Phone: ");
        String personalPhone = scanner.nextLine();
        System.out.println("Please input Personal Username: ");
        String personalUsername = scanner.nextLine();
        System.out.println("Please input Personal UserID: ");
        String personalUserID = scanner.nextLine();
        Personal personal = new Personal(personalId, personalName, personalSurname, personaldateofbirth,personalCountry,personalAddress,personalEmail,personalUsername,personalUserID,companyFromStorage);
        personalStorage.add(personal);
        System.out.println("Personal Registered! ");
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
        Company company = new Company(companyId, companyName, companyAddress, companyFromStorage);
        companyStorage.add(company);
        System.out.println("Company Registered.! ");
    }
    private static void printCommands() {
        System.out.println("""
                PLEASE INPUT 0 FOR Exit
                PLEASE INPUT 1 FOR ADD_PROGRAM
                PlEASE INPUT 2 for ADD_PERSONAL
                PLEASE INPUT 3 FOR PRINT_ALL_COMPANY
                PLEASE INPUT 4 FOR PRINT_ALL_PERSONAL
                PLEASE INPUT 5 FOR SEARCH_PROGRAM_BY_EMAIL
                PLEASE INPUT 6 FOR SEARCH BY PHONE NUMBER
                PLEASE INPUT 7 FOR CHANGE COMPANY ID
                PLEASE INPUT 8 FOR CHANGE PERSONAL ID
                PLEASE INPUT 9 FOR DELETE BY PERSONAL ID
                PLEASE INPUT 10 FOR DELETE BY COMPANY ID""");


            }

        }