package onlinestore.user;

public enum UserType {

    USER, ADMIN;

    private String authenticate;

    UserType(String authenticate) {
        this.authenticate = authenticate;
    }

    UserType() {
    }

    public String getAuthenticate() {
        return authenticate;
    }

    public void setAuthenticate(String authenticate) {
        this.authenticate = authenticate;
    }
}