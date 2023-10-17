package medicialcenter1.model;

import java.util.Date;

public class Doctor  extends Person {
    private String profession;
    private String email;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String phone, Date dateOfBirthday, Date registerDate, String profession, String email) {
        super(id, name, surname, phone, dateOfBirthday, registerDate);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof medicialcenter.model.Doctor doctor)) return false;
        if (!super.equals(o)) return false;

        if (getProfession() != null ? !getProfession().equals(doctor.getProfession()) : doctor.getProfession() != null)
            return false;
        return getEmail() != null ? getEmail().equals(doctor.getEmail()) : doctor.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getProfession() != null ? getProfession().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}



