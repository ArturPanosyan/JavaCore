package medicialcenter1;

import medicialcenter1.model.Doctor;
import medicialcenter1.model.Patient;
import medicialcenter1.model.Person;
import medicialcenter1.storage.PersonStorage;
import medicialcenter1.util.DateUtil;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;


public class MedicialCenterDemo implements Command {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String Command = scanner.nextLine();
            switch (Command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PATIENT_STORAGE_PRINT:
                    personStorage.printPatient();
                    break;
                case DELETE_PATIENT_BY_ID:
                    deletePatientById();
                    break;
                default:
                    System.out.println("Invalid Command: Try Again!!! ");
                    break;
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctor();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Person personFromStorage = personStorage.getById(doctorId);
        if(personFromStorage == null){
            System.out.println("Doctor with " + doctorId + "does not exists");
            return;
        }
        personStorage.searchPatientByDoctor(personFromStorage);
    }

    private static void addPatient() {
        personStorage.printDoctor();
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        Person personFromStorage = personStorage.getById(doctorProfession);
        if (personFromStorage == null) {
            System.out.println("Doctor with Profession " + doctorProfession + " does not exist!!!");
            return;
        }
        System.out.println("Please input Patient ID: ");
        String patientId = scanner.nextLine();
        System.out.println("Please input Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.println("Please input Patient Surname: ");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input Patient Phone: ");
        String patientPhone = scanner.nextLine();
        System.out.println("Please input Patient Date Of Birthday (dd:MM:yyyy): ");
        String dateOfBirthday = scanner.nextLine();
        System.out.println("Please input Patient Email: ");
        String patientEmail = scanner.nextLine();
        Date registerDate = new Date();
        Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, dateOfBirthday, registerDate,);
        personStorage.add(patient);
        System.out.println("Patient Registered: " + patient);
    }

    private static void changeDoctorById() throws ParseException {
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Person personFromStorage = personStorage.getById(doctorId);
        if (personFromStorage == null) {
            System.out.println("Doctor ID " + doctorId + "does not exists!!!");
            return;
        }
        System.out.println("Please input New Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Please Input Doctor Surname: ");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please Input Doctor Phone: ");
        String doctorPhone = scanner.nextLine();
        System.out.println("Please input Doctor Date Of Birthday (dd:MM:yyyy: ");
        String dateOfBirthdayStr = scanner.nextLine();
        Date dateOfBirthday = DateUtil.stringToDate(dateOfBirthdayStr);
        System.out.println("Please input Doctor Email: ");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        System.out.println("Register Date: ");
        Date registerDate = new Date();
        personFromStorage.setName(doctorName);
        personFromStorage.setSurname(doctorSurname);
        personFromStorage.setDateOfBirthday(dateOfBirthday);
        personFromStorage.setPhone(doctorPhone);

    }



    private static void deleteDoctorById() {
        System.out.println("Enter Doctor Id: ");
        String Id = scanner.nextLine();
        personStorage.deletePatientByDoctorId(Id);
        personStorage.deleteDoctorById(Id);

    }
    private static void deletePatientById() {
        System.out.println("Enter Patient ID: ");
        String Id = scanner.nextLine();
        Person personFromStorage = personStorage.getById(Id);
        if(personFromStorage == null){
            System.out.println("Patient with " + Id + "does not exists!!!");
            return;
        }
       deletePatientById();
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input Profession");
        String doctorProfession = scanner.nextLine();
        personStorage.searchDoctorByProfession(doctorProfession);
    }

    private static void addDoctor() throws ParseException {
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Person personFromStorage = personStorage.getById(doctorId);
        if (personFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "does do not exists!!!");
            return;
        }
        System.out.println("Please Input Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Please Input Doctor Surname: ");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please Input Doctor Phone: ");
        String doctorPhone = scanner.nextLine();
        System.out.println("Please input Doctor Date Of Birthday (dd:MM:yyyy: ");
        String dateOfBirthdayStr = scanner.nextLine();
        Date dateOfBirthday = DateUtil.stringToDate(dateOfBirthdayStr);
        System.out.println("Please input Doctor Email: ");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        System.out.println("Register Date: ");
        Date registerDate = new Date();
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorPhone, dateOfBirthday, registerDate, doctorProfession, doctorEmail);
        personStorage.add(doctor);
        System.out.println("Doctor Registered: ");
    }
}
