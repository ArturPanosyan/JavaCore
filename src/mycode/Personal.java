package mycode;

public class Personal {

    private String name;
    private String surname;
    private String gender;
    private double dateofbirth;
    private double personalId;
    private String country;
    private String address;
    private String email;
    private double phone;
    private String username;
    private String userId;
    private String company;


    public Personal(String name, String surname, String gender, double dateofbirth, String personalId, String country, String address, String email, String username, String userId, String company) {
        this.username = username;
        this.userId = userId;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.personalId = Double.parseDouble(personalId);
        this.country = country;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.company = company;

    }

    public Personal(String personalId, String personalName, String personalSurname, double personaldateofbirth, String personalCountry, String personalAddress, String personalEmail, String personalUsername, String personalUserID, Company companyFromStorage) {
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

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
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


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dateofbirth=" + dateofbirth +
                ", personalId=" + personalId +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", username='" + username + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}
