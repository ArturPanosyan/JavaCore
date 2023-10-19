package medicialcenter.model;

import java.util.Objects;

public class Doctor extends Person {

    private String profession;
    private String email;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phone, String profession, String email) {
        super(id, name, surname, phone);
        this.profession = profession;
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "profession='" + profession + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Doctor doctor = (Doctor) o;

        if (!Objects.equals(profession, doctor.profession)) return false;
        return Objects.equals(email, doctor.email);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}

