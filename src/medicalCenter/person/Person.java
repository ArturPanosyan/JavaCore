package medicalCenter.person;

public class Person {

    private String Id;
    private String name;
    private String surname;
    private String email;
    private double phone;
    private String profeesion;



    public Person(String personId, String name, String surname, String  email, double phone, String profeesion) {
        Id = personId;
        this.name = name;
        this.surname = surname;

        this.email = email;
        this.phone = phone;
        this.profeesion = profeesion;
    }

    public Person() {
    }

    public String getPersonId() {
        return Id;
    }

    public void setPersonId(String personId) {
        Id = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public String getProfeesion() {
        return profeesion;
    }

    public void setProfeesion(String profeesion) {
        this.profeesion = profeesion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", profeesion='" + profeesion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;

        if (Double.compare(getPhone(), person.getPhone()) != 0) return false;
        if (getPersonId() != null ? !getPersonId().equals(person.getPersonId()) : person.getPersonId() != null)
            return false;
        if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
        if (getSurname() != null ? !getSurname().equals(person.getSurname()) : person.getSurname() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(person.getEmail()) : person.getEmail() != null) return false;
        return getProfeesion() != null ? getProfeesion().equals(person.getProfeesion()) : person.getProfeesion() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getPersonId() != null ? getPersonId().hashCode() : 0;
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        temp = Double.doubleToLongBits(getPhone());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getProfeesion() != null ? getProfeesion().hashCode() : 0);
        return result;
    }
}
