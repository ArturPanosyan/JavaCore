package medicalCenter.doctor;

import medicalCenter.person.Person;

public class Doctor extends Person {

    private String DoctorID;
    private double salary;



    public Doctor(String personId, String name, String surname, String email, double phone, String profeesion, String doctorID, double salary) {
        super(personId, name, surname, email, phone, profeesion);
        DoctorID = doctorID;
        this.salary = salary;
    }

    public Doctor(String doctorId, String doctorName, String doctorSurname, String doctorEmail, double doctorPhone, String doctorProfession, double doctorSalary, DoctorStorage doctorStorage) {
    }

    public String getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(String doctorID) {
        DoctorID = doctorID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "DoctorID='" + DoctorID + '\'' +
                ", salary=" + salary +
                '}';
    }


}
