package medicialcenter1.model;

import medicialcenter.model.Doctor;

import java.util.Date;

public class Patient  extends  Person {
    private Doctor doctor;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String phone, Date dateOfBirthday, Date registerDate, Doctor doctor) {
        super(id, name, surname, phone, dateOfBirthday, registerDate);
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override

    public String toString() {
        return "Patient{" +
                "doctor=" + doctor +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof medicialcenter.model.Patient patient)) return false;
        if (!super.equals(o)) return false;

        if (getDoctor() != null ? !getDoctor().equals(patient.getDoctor()) : patient.getDoctor() != null) return false;
        return getRegisterDate() != null ? getRegisterDate().equals(patient.getRegisterDate()) : patient.getRegisterDate() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getDoctor() != null ? getDoctor().hashCode() : 0);
        result = 31 * result + (getRegisterDate() != null ? getRegisterDate().hashCode() : 0);
        return result;
    }
}

