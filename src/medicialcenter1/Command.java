package medicialcenter1;

public interface Command {

    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String CHANGE_DOCTOR_BY_ID = "4";
    String ADD_PATIENT = "5";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "6";
    String PATIENT_STORAGE_PRINT = "7";
    String DELETE_PATIENT_BY_ID = "8";


     static void printCommands() {
        System.out.println("""
                Please input "+EXIT+" for Exit:
                Please input "++" for  Add_Doctor:
                Please input "++" for Search Doctor By Profession:
                Please input "++" for Delete Doctor By Id:
                Please input "++" for Change Doctor By Id:
                Please input "++" for Add_Patient:
                Please input "++" for Print All Patients By Doctor:
                Please input "++" for Print Patients:
                Please input "++" for Delete Patient By Id:
                """);
    }
}