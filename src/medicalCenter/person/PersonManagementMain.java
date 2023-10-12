package medicalCenter.person;

import medicalCenter.doctor.Doctor;
import medicalCenter.doctor.DoctorStorage;
import medicalCenter.patient.Patient;
import medicalCenter.patient.PatientStorage;
import mycode.PersonalStorage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class PersonManagementMain {
    private static Scanner scanner = new Scanner(System.in);
    private static PersonalStorage personStorage = new PersonalStorage();
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();
    private Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat();

    public static void main(String[] args) {
        boolean isRun = true;

        while(isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addDoctor();
                    break;
                case "2":
                    searchDoctorByProfession();
                    break;
                case "3":
                    deleteDoctorById();
                    break;
                case "4":
                    changeDoctorById();
                    break;
                case "5":
                    addPatient();
                    break;
                case "6":
                    printAllPatientsByDoctor();
                    break;
                case "7":
                    printAllPatients();
                    break;
                default:
                    System.out.println("Invalid command! Try Again: ");
                    break;
            }
        }
    }

    public void registereddatetime(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd//mm//yyyy hh:mm:ss");
    }
    private static void printAllPatients() {
        System.out.println("All Patients:");
        patientStorage.print();
    }

    private static void printAllPatientsByDoctor() {
        System.out.println("Please input Doctor ID: ");
        doctorStorage.print();
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if(doctorFromStorage == null){
            System.out.println("Doctor with" + doctorId  + "does not exists!!!" );
        return;
    }
        System.out.println("Please input Patients ID: ");
        patientStorage.print();
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getById(patientId);
        if(patientFromStorage == null){
            System.out.println("Patient with " + patientId + "does not exists!!!");
        return;
        }
        System.out.println();
}

    private static void addPatient() {
        System.out.println("Please input Patient ID: ");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getById(patientId);
        if(patientFromStorage != null) {
            System.out.println("Patient with " + patientId + "does not exists!!!");
         return;
        }
        System.out.println("Please input Patient ID:");
        String patientID = scanner.nextLine();
        System.out.println("Please input Patient Name: ");
        String patientName = scanner.nextLine();
        System.out.println("Please input Patient Surname: ");
        String patientSurname = scanner.nextLine();
        System.out.println("Please input Patient Email: ");
        String patientEmail = scanner.nextLine();
        System.out.println("Please input Patient Phone: ");
        double patientPhone = parseDouble(scanner.nextLine());
        System.out.println("Please input Patient Profession: ");
        String patientProfession = scanner.nextLine();
        System.out.println("Please input Doctor Name: ");
        String doctorName = scanner.nextLine();
        Patient patient = new Patient(patientName, patientSurname, patientEmail, patientId, patientPhone, patientProfession, patientStorage);
        patientStorage.add(patient);
        System.out.println("Patient Registered! ");
    }

    private static void changeDoctorById() {
        System.out.println("Please input Patient By ID: ");
        patientStorage.print();
        String patientId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(patientId);
        if((patientStorage == null)){
            System.out.println("Patient with " + patientId + "does not exists!!!");
        return;
        }
        doctorStorage.searchDoctorByProfession(doctorFromStorage);
        System.out.println("Please input Doctor ID: ");
        String doctorId = scanner.nextLine();
        doctorFromStorage = doctorStorage.getById(doctorId);
        if(doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "does not exists!!!");
            return;
        }
        System.out.println("Please input Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Please input Doctor Surname: ");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input Doctor Email: ");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input Doctor Phone: ");
        double doctorPhone = parseDouble(scanner.nextLine());
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        System.out.println("Please input Doctor Salary USD: ");
        double doctorSalary = parseDouble(scanner.nextLine());
        doctorFromStorage.setName(doctorName);
        doctorFromStorage.setSurname(doctorSurname);
        doctorFromStorage.setEmail(doctorEmail);
        doctorFromStorage.setPhone(doctorPhone);
        doctorFromStorage.setProfeesion(doctorProfession);
        doctorFromStorage.setSalary(doctorSalary);
        System.out.println("Doctor Updated! ");
    }

    private static void deleteDoctorById() {
        System.out.println("Please input Doctor ID: ");
        doctorStorage.print();
        String DoctorID = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(DoctorID);
        if(doctorFromStorage == null){
            System.out.println("Please with " + DoctorID + "does not exists!!!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input Doctor ID: ");
        String DoctorID = scanner.nextLine();
        Doctor byID = doctorStorage.getById(DoctorID);
        if(byID == null) {
            System.out.println("Doctor does not exists!!! ");
        } else {
            System.out.println(byID);
        }
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor ID: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage != null) {
            System.out.println("Doctor with ID " + doctorId + " already exists!!!");
            return;
        }
        System.out.println("Please input Doctor Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Please input Doctor Surname: ");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input Doctor Email: ");
        String doctorEmail = scanner.nextLine();
        System.out.println("Please input Doctor Phone: ");
        double doctorPhone = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        System.out.println("Please input Doctor Salary USD: ");
        double doctorSalary = Double.parseDouble(scanner.nextLine());
        Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorEmail, doctorPhone, doctorProfession, doctorSalary, doctorStorage);
        doctorStorage.add(doctor);
        System.out.println("Doctor Registered: ");
    }

    private static void printCommands() {
        System.out.println("""
                Please input 0 for Exit:
                Please input 1 for Add_Doctor:
                Please input 2 for Search_Doctor_By_Profession:
                Please input 3 for Delete_Doctor_By_ID:
                Please input 4 for Change_Doctor_By_ID:
                Please input 5 for Add_Patient:
                Please input 6 for Print_All_Patients_By_Doctor:
                Please input 7 for Print_All_Patients:
                 """);
    }
}
