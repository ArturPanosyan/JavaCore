package medicialcenter.storage;

import medicialcenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctors = new Doctor[10];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length - 1) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }
    }


    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }

    public Doctor getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return doctors[i];
            }
        }
        return null;
    }

    public void searchDoctorByprofession(String doctorProfession) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfession().contains(doctorProfession)) {
                System.out.println(doctors[i]);
            }
        }
    }

    public void deleteById(String doctorId) {
        int indexById = getindexById(doctorId);
        if (indexById == -1) {
            System.out.println("Doctor with " + doctorId + "does not exists!!!");
        }
        for (int i = indexById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
        size--;
    }

    private int getindexById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getId().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }
}