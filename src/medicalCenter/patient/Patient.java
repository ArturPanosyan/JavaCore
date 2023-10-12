package medicalCenter.patient;
import medicalCenter.person.Person;

public class Patient extends Person {
    private double phone;
    private String Idcard;

    public Patient(String personId, String name, String surname, String email, double phone, String profeesion, double phone1, String idcard) {
        super(personId, name, surname, email, phone, profeesion);
        this.phone = phone1;
        Idcard = idcard;
    }

    public Patient(String patientName, String patientSurname, String patientEmail, String patientId, double patientPhone, String patientProfession, PatientStorage patientStorage) {
    }

    @Override
    public double getPhone() {
        return phone;
    }

    @Override
    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return Idcard;
    }

    public void setIdcard(String idcard) {
        Idcard = idcard;
    }


}