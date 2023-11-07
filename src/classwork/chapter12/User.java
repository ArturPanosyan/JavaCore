package classwork.chapter12;

public class User {
    private String name;
    private String surname;
    private String email;
    private Language language;

    public User(String name, String surname, String email, Language language) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.language = language;
    }

    public User() {
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", language=" + language +
                '}';
    }

}
