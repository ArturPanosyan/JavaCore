package medicialcenter.storage;

import medicialcenter.model.Doctor;
import medicialcenter.model.Patient;
import medicialcenter.model.Person;
import medicialcenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {

    private Person[] people = new Person[10];
    private int size;

    public void add(Person person) {
        if (size == people.length - 1) {
            extend();
        }
        people[size++] = person;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Doctor) {
                System.out.println(people[i]);
            }
        }
    }


    public Person getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (people[i].getId().equals(doctorId)) {
                return people[i];
            }
        }
        return null;
    }

    public void searchDoctorByprofession(String profession) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Doctor) {
                Doctor doctor = (Doctor) person;
                if (doctor.getProfession().equals(profession)) {
                    System.out.println(doctor);
                }
            }
        }
    }

    public void deleteDoctorById(String Id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person.getId().equals(Id) && person instanceof Doctor) {
                deleteByIndex(i);
            }

        }
    }

    public Doctor getDoctorById(String Id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person.getId().equals(Id) && person instanceof Doctor) {
                return (Doctor) person;
            }
        }
        return null;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor)) {
                    System.out.println(patient);
                }
            }
        }
    }


    public void printTodaysPatients() {
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (people[i] instanceof Patient) {
                Patient patient = (Patient) people[i];
                if (DateUtil.isSameDay(today, patient.getRegisterDateTime())) {
                    System.out.println(patient);
                }
            }
        }
    }

    public void deletePatientById(String Id) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person.getId().equals(Id) && person instanceof Patient) {
                deleteByIndex(i);
            }
        }
    }

    public boolean isDoctorAvailable(Doctor doctor, Date registerDateTime) {
        for (int i = 0; i < size; i++) {
            Person person = people[i];
            if (person instanceof Patient) {
                Patient patient = (Patient) person;
                if (patient.getDoctor().equals(doctor) &&
                        patient.getRegisterDateTime().equals(registerDateTime)) {
                    return false;
                }
            }
        }
        return true;
    }

    private void extend() {
        Person[] tmp = new Person[people.length + 10];
        System.arraycopy(people, 0, tmp, 0, people.length);
        people = tmp;
    }

    private void deleteByIndex(int i) {
        for (int j = i; j < size; j++) {
            people[j] = people[j + 1];
        }
        size--;
    }
}