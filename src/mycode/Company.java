package mycode;

import java.util.Objects;

public class Company {

    private String Username;
    private String UserID;
    private String name;
    private String surname;
    private String country;
    private String address;
    private String personalID;
    private String email;
    private double phone;

    public Company(String username, String userID, String name, String surname, String country, String address, String personalID, String email, double phone) {
        Username = username;
        UserID = userID;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.address = address;
        this.personalID = personalID;
        this.email = email;
        this.phone = phone;
    }

    public Company(String companyId, String companyName, String companyAddress, Company companyFromStorage) {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPersonalID() {
        return personalID;
    }

    public void setPersonalID(String personalID) {
        this.personalID = personalID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company that = (Company) o;

        if (Double.compare(phone, that.phone) != 0) return false;
        if (!Objects.equals(Username, that.Username)) return false;
        if (!Objects.equals(UserID, that.UserID)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(surname, that.surname)) return false;
        if (!Objects.equals(country, that.country)) return false;
        if (!Objects.equals(address, that.address)) return false;
        if (!Objects.equals(personalID, that.personalID)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Username != null ? Username.hashCode() : 0;
        result = 31 * result + (UserID != null ? UserID.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (personalID != null ? personalID.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        temp = Double.doubleToLongBits(phone);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "Username='" + Username + '\'' +
                ", UserID='" + UserID + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", personalID='" + personalID + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }


}
