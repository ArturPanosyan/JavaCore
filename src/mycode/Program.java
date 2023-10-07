package mycode;

public class Program {

    private String name;
    private String surname;
    private String gender;
    private double dateofbirth;
    private double personalId;
    private String country;
    private String address;
    private String email;
    private double phoneNumber;
    private String username;
    private String userId;

    public Program(String name, String surname, String gender, double dateofbirth, double personalId, String country, String address, String email, double phoneNumber, String username, String userId) {
        this.username = username;
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.personalId = personalId;
        this.country = country;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Program() {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(double dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public double getPersonalId() {
        return personalId;
    }

    public void setPersonalId(double personalId) {
        this.personalId = personalId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", personalId=" + personalId +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
