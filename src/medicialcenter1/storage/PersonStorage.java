package medicialcenter1.storage;

import medicialcenter1.model.Doctor;
import medicialcenter1.model.Patient;
import medicialcenter1.model.Person;

public class PersonStorage {

    private Person[] person = new Person [100];
    private  int size;
    private int index;



    public void add(Person people){
        for (int i = 0; i < size; i++) {
            if(size == person.length){
                extend();
            }
        person[size++] = people;
        }
    }


    private void extend() {
        Person[] tmp = new Person[person.length + 10];
        System.arraycopy(person, 0, tmp, 0, person.length);
        person = tmp;
    }


    public void printDoctor(){
        for (int i = 0; i < size; i++) {
            if (person[i] instanceof Doctor ){
                System.out.println(person[i]);
            }
        }
    }

    public void printPatient() {
        for (int i = 0; i < size; i++) {
            if(person[i] instanceof Patient){
                System.out.println(person[i]);
            }
        }

    }


    public Person getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if(person[i].getId().equals(doctorId)){
              return person[i];
            }
        }
        return null;
    }

    public void searchDoctorByProfession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (person[i] instanceof Doctor && ((Doctor) person[i]).getProfession().contains(doctorProfession)) {
                System.out.println(person[i]);
            }
        }
    }


    public void searchPatientByDoctor(Person personFromStorage) {
        for (int i = 0; i < size; i++) {
           if(person[i] instanceof Doctor){
               System.out.println(person[i]);
           }
        }
    }


    public void deletePatientByDoctorId(String id) {
        for (int i = 0; i < index; i++) {
            if (person[i] instanceof Patient && (((Patient) person[i]).getDoctor().getId().contains(id))){
                deleteByIndex(i);
            }
        }
    }

    private void deleteByIndex(int index) {
     for (int i = index + 1; i < size; i++) {
         person[i] = person[i + 1];
     }
    size--;
    }


    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if(person[i] instanceof  Doctor) {
                deleteDoctorById(id);
            }
        }
    }
}

