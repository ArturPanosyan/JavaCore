package medicialcenter;

public class MyException extends Exception {
    private  String email;
    
    public MyException(String email) {
        email = email;
    }

    public MyException(String message, String email) {
        super(message);
        this.email = email;
    }

    public MyException(String message, Throwable cause, String email) {
        super(message, cause);
        this.email = email;
    }

    public MyException(Throwable cause, String email) {
        super(cause);
        this.email = email;
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String email) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.email = email;
    }

    public MyException() {
    }

    public String getSearchEmail() {
        return email;
    }

    public void setSearchEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "email='" + email + '\'' +
                "} " + super.toString();
    }
}
