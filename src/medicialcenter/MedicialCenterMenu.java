package medicialcenter;

import medicialcenter.model.Doctor;
import medicialcenter.model.Patient;
import medicialcenter.storage.PersonStorage;
import medicialcenter.util.DateUtil;

import java.nio.channels.ScatteringByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class MedicialCenterMenu implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();


    public static void main(String[] args) {
        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case Exit:
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
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                case DELETE_PATIENTS_BY_ID:
                    deletePatientById();
                    break;
                default:
                    System.out.println("Wrong Command: ");
                    break;
            }
        }
    }

    public static void deletePatientById() {
        personStorage.printTodaysPatients();
        System.out.println("Please input Patients Id: ");
        String patientId = scanner.nextLine();
        Patient patientById = (Patient) personStorage.getById(patientId);
        if (patientById != null) {
            personStorage.deletePatientById(patientId);
        } else {
            System.out.println("Patient with " + patientId + "does not exists!!!");
        }
    }


    private static void addDoctor() {
        System.out.println("Please input Id, Name, Surname, Phone, Email, Profession: ");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        try {
            Doctor doctorById = personStorage.getDoctorById(doctorId);
            if (doctorById == null) {
                Doctor doctor = new Doctor();
                doctor.setId(doctorId);
                doctor.setName(doctorData[1]);
                doctor.setSurname(doctorData[2]);
                doctor.setPhone(doctorData[3]);
                doctor.setEmail(doctorData[4]);
                doctor.setProfession(doctorData[5]);
                personStorage.add(doctor);
                System.out.println("Doctor Registered! ");
            }else{
                System.out.println("Doctor with " + doctorId + "does not exists!!!");
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Incorrect Doctor registered: Please try again! ");
        }
    }


    public static void searchDoctorByProfession() {
        System.out.println("Please input Doctor Profession: ");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByprofession(profession);
    }

    public static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Doctor with " + doctorId + "does not exists!!!!");
        }
    }

    public static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("Doctor with" + doctorId + "does not exists!!!");
        }

    }

    public static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input Id, Name, Surname, Phone, registerDateTime(26/02/2023 14:00): ");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhone(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("Patient Registered: ");
                } else {
                    System.out.println("Doctor is unavailable in that time: Please choose another time ");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format: Please try again! ");
            }
        } else {
            System.out.println("Doctor with" + doctorId + "does not exists!!!");
        }
    }

    public static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please input Doctor Id: ");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input Name, Surname, Phone, Email, Profession: ");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0]);
            doctorById.setSurname(doctorData[1]);
            doctorById.setPhone(doctorData[2]);
            doctorById.setEmail(doctorData[3]);
            doctorById.setProfession(doctorData[4]);
            System.out.println("Doctor changed: ");
        } else {
            System.out.println("Doctor with " + doctorId + "does not exists!!! ");
        }

    }
}