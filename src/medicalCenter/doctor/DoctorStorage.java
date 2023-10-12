package medicalCenter.doctor;

public class DoctorStorage {
    private Doctor[] doctors = new Doctor[100];
    private int size;

    public void add(Doctor doctor) {
        if (size == doctors.length) {
            extend();
        }
        doctors[size++] = doctor;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctors[i]);
        }

    }

    public void searchDoctorByProfession(Doctor doctorFromStorage) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getProfeesion().equals(doctorFromStorage)) {
                System.out.println(doctors[i]);
            }
        }
    }
    public void deleteDoctorById(String doctorId) {
        int DoctorById = getDoctorById(doctorId);
        if (DoctorById == -1) {
            System.out.println("Doctors does not exists!!! ");
            return;
        }
        for (int i = DoctorById + 1; i < size; i++) {
            doctors[i - 1] = doctors[i];
        }
    }

    private int getDoctorById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i].getDoctorID().equals(doctorId)) {
                return i;
            }
        }
        return -1;
    }

    public Doctor getById(String doctorId) {
        for (int i = 0; i < size; i++) {
            if (doctors[i] != null && doctorId.equals(doctors[i].getDoctorID())) {
                return doctors[i];
            }
        }
        return null;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[doctors.length + 10];
        System.arraycopy(doctors, 0, tmp, 0, doctors.length);
        doctors = tmp;
    }
}