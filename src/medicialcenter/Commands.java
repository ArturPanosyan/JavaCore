package medicialcenter;

public interface Commands {

    String Exit = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PRINT_TODAYS_PATIENTS = "7";
    String DELETE_PATIENTS_BY_ID = "8";
    String SEARCH_EMAIL_BY_ID = "9";

    static void printCommands() {
        System.out.println("Please input " + 0 + " for Exit");
        System.out.println("Please input " + 1 + " for ADD_DOCTOR");
        System.out.println("Please input " + 2 + " for SEARCH_DOCTOR_BY_PROFESSION");
        System.out.println("Please input " + 3 + " for DELETE_DOCTOR_BY_ID");
        System.out.println("Please input " + 4 + " for CHANGE_DOCTOR_BY_ID");
        System.out.println("Please input " + 5 + " for ADD_PATIENT");
        System.out.println("Please input " + 6 + " for PRINT_ALL_PATIENTS_BY_DOCTOR");
        System.out.println("Please input " + 7 + " for PRINT_TODAYS_PATIENTS");
        System.out.println("Please input " + 8 + " for DELETE_PATIENTS_BY_ID");
        System.out.println("Please input " + 9 + " for SEARCH_EMAIL_BY_ID");
    }
}