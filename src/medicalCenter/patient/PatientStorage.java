package medicalCenter.patient;

import medicalCenter.doctor.Doctor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PatientStorage {
    private Patient[] patients = new Patient[100];
    private int size;


        public void add(Patient patient) {
            if (size == patients.length) {
                extend();
            }
            patients[size++] = patient;
        }

        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.println(patients[i]);
            }
        }

        public Patient getById(String patientId) {
            for(int i = 0; i < size; i++) {
                if (patients[i].getIdcard().equals(patientId)) {
                    return patients[i];
                }
            }
            return null;
        }

        public void deleteById(String patientId) {
            int indexById = getIndexById(patientId);
            if (indexById == -1) {
                System.out.println("Patient does not exist!");
                return;
            }
            for (int i = indexById; i < size - 1; i++) {
                patients[i] = patients[i + 1];
            }
            size--;
        }

        private int getIndexById(String patientId) {
            for (int i = 0; i < size; i++) {
                if (patients[i].getIdcard().equals(patientId)) {
                    return i;
                }
            }
            return -1;
        }


    public void searchPatientByDoctor(Patient doctor) {
            for (int i = 0; i < size; i++) {
                if(patients[i].getIdcard().equals(doctor.getIdcard())) {
                    System.out.println(patients[i]);
                }
            }
        }

        private void extend() {
            Patient[] tmp = new Patient[patients.length + 10];
            System.arraycopy(patients, 0, tmp, 0, patients.length);
            patients = tmp;
        }
    }




