package medicialcenter.storage;

import medicialcenter.model.Doctor;
import medicialcenter.model.Patient;

public class PatientStorage {

    private Patient[] patients = new Patient[10];
    private int size;

    public void add(Patient patient){
        if(size == patients.length - 1 ) {
            extend();
        }
        patients[size++] = patient;
    }



    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(patients[i]);
        }
    }

    private void extend() {
        Patient[] tmp = new Patient[patients.length + 10];
        System.arraycopy(patients, 0, tmp, 0, patients.length);
        patients= tmp;
    }

    public Patient getById(String patientId) {
        for (int i = 0; i < size; i++) {
            if(patients[i].getId().contains(patientId)){
                return  patients[i];
            }

        }
         return  null;
    }

    public void searchPatientByDoctor(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {
            if(patients[i].getDoctor().equals(doctorFromStorage)){
                System.out.println(patients[i]);
            }
        }
    }

    public void deleteByPatientId(String patientId) {
       int indexById =  getIndexById(patientId);
       if(indexById == -1){
           System.out.println("Patient with " + patientId + "does not exists!!!!");
           return;
       }
        for (int i = indexById + 1; i < size; i++) {
            patients[i - 1] = patients[i];
        }
        size--;
        }

    private int getIndexById(String patientId) {
        for (int i = 0; i < size; i++) {
            if(patients[i].getId().equals(patientId)){
                return  i;
            }

        }
        return  - 1;

    }
}



