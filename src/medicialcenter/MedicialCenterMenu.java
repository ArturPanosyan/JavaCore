package medicialcenter;

import medicialcenter.model.Doctor;
import medicialcenter.model.Patient;
import medicialcenter.storage.DoctorStorage;
import medicialcenter.storage.PatientStorage;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MedicialCenterMenu {

    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = new DoctorStorage();
    private static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            printCommand();
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
                    patientStorage.print();
                    break;
                case "8":
                    deletePatientById();
                    break;
                default:
                    System.out.println("Invalid Command: Try Again: ");
                    break;
            }
        }
    }

    private static void deletePatientById() {
        patientStorage.print();
        System.out.println("Please input Patient Id: ");
        String patientId = scanner.nextLine();
        Patient patientFromStorage = patientStorage.getById(patientId);
        if(patientFromStorage == null) {
            System.out.println("Patient with " + patientId + "does not exists!!!");
       return;
        }
        doctorStorage.searchDoctorByprofession(patientId);
        System.out.println("Please input Doctor ID: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if(doctorFromStorage == null) {
            System.out.println("Doctor with " + patientId + "does not exists!!!!");
            return;
        }
        if(!patientFromStorage.getDoctor().equals(doctorFromStorage)){
            System.out.println("Wrong Patient ID: ");
            return;
        }
            patientStorage.deleteByPatientId(patientId);
    }

    private static void deleteDoctorById() {
         doctorStorage.print();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if(doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " does not exists!!!");
              return;
        }
        doctorStorage.deleteById(doctorId);
    }

    private static void printAllPatientsByDoctor() {
        doctorStorage.print();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " does not exists!!!");
            return;
        }
        patientStorage.searchPatientByDoctor(doctorFromStorage);
    }

    private static void addPatient() {
        doctorStorage.print();
        System.out.println("Please input Doctor ID: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + " does not exists!");
            return;
        }
        System.out.println("Please input Patient Id: ");
        String patientId = scanner.nextLine();
        Patient patientfromStorage = patientStorage.getById(patientId);
        if (patientfromStorage == null) {
            System.out.println("Please input Patient Name: ");
            String patientName = scanner.nextLine();
            System.out.println("Please input Patient Surname: ");
            String patientSurname = scanner.nextLine();
            System.out.println("Please input Patient Phone: ");
            String patientPhone = scanner.nextLine();
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd//MM//yyyy ");
            String registerDate = sdf.format(date);
            Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, doctorFromStorage, registerDate);
            patientStorage.add(patient);
            System.out.println("Patient Registered: ");

        }


    }

    private static void changeDoctorById() {
        doctorStorage.print();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Doctor with " + doctorId + "does not exists!!! ");
            return;
        }
        System.out.println("Please input Doctor New Name: ");
        String doctorName = scanner.nextLine();
        System.out.println("Please input Doctor New Surname: ");
        String doctorSurname = scanner.nextLine();
        System.out.println("Please input Doctor New Phone: ");
        String doctorPhone = scanner.nextLine();
        System.out.println("Please input Doctor New Profession: ");
        String doctorProfession = scanner.nextLine();
        System.out.println("Please input Doctor New Email: ");
        String doctorEmail = scanner.nextLine();
        doctorFromStorage.setName(doctorName);
        doctorFromStorage.setSurname(doctorSurname);
        doctorFromStorage.setPhone(doctorPhone);
        doctorFromStorage.setProfession(doctorProfession);
        doctorFromStorage.setEmail(doctorEmail);
        System.out.println("Doctor Updated! ");
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input Doctor Profession: ");
        String doctorProfession = scanner.nextLine();
        doctorStorage.searchDoctorByprofession(doctorProfession);
    }

    private static void addDoctor() {
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorFromStorage = doctorStorage.getById(doctorId);
        if (doctorFromStorage == null) {
            System.out.println("Please input Doctor Name: ");
            String doctorName = scanner.nextLine();
            System.out.println("Please input Doctor Surname: ");
            String doctorSurname = scanner.nextLine();
            System.out.println("Please input Doctor Phone: ");
            String doctorPhone = scanner.nextLine();
            System.out.println("Please input Doctor Profession: ");
            String doctorProfession = scanner.nextLine();
            System.out.println("Please input Doctor Email: ");
            String doctorEmail = scanner.nextLine();
            Doctor doctor = new Doctor(doctorId, doctorName, doctorSurname, doctorPhone, doctorProfession, doctorEmail);
            doctorStorage.add(doctor);
            System.out.println("Doctor Registered! ");
        }

    }


    private static void printCommand() {
        System.out.println("""
                Please input 0 for Exit:
                Please input 1 for  Add_Doctor:
                Please input 2 for Search Doctor By Profession:
                Please input 3 for Delete Doctor By Id:
                Please input 4 for Change Doctor By Id:
                Please input 5 for Add_Patient:
                Please input 6 for Print All Patients By Doctor:
                Please input 7 for Print Patients:
                Please input 8 for Delete Patient By Id:
                """);
    }

}

