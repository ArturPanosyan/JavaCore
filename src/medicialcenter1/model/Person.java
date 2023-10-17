package medicialcenter1.model;

import java.util.Date;

public class Person {

        private String Id;
        private String name;
        private String surname;
        private String phone;
        private Date dateOfBirthday;
        private Date registerDate;

        public Person() {
        }

        public Person(String id, String name, String surname, String phone, Date dateOfBirthday, Date registerDate) {
            Id = id;
            this.name = name;
            this.surname = surname;
            this.phone = phone;
            this.dateOfBirthday = dateOfBirthday;
            this.registerDate = registerDate;
        }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirthday=" + dateOfBirthday +
                ", registerDate=" + registerDate +
                '}';
    }

    @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof medicialcenter.model.Person person)) return false;

            if (getId() != null ? !getId().equals(person.getId()) : person.getId() != null) return false;
            if (getName() != null ? !getName().equals(person.getName()) : person.getName() != null) return false;
            if (getSurname() != null ? !getSurname().equals(person.getSurname()) : person.getSurname() != null)
                return false;
            return getPhone() != null ? getPhone().equals(person.getPhone()) : person.getPhone() == null;
        }

        @Override
        public int hashCode() {
            int result = getId() != null ? getId().hashCode() : 0;
            result = 31 * result + (getName() != null ? getName().hashCode() : 0);
            result = 31 * result + (getSurname() != null ? getSurname().hashCode() : 0);
            result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
            return result;
        }
    }

