package classwork.chapter12;

public class UserTest {
    public static void main(String[] args) {
        String lang = "Ru";
        Language language = Language.valueOf(lang.toUpperCase());
        User user = new User("Poxos", "Poxosyan", "poxos@gmail.com", Language.HY);
        User user1 = new User("Petros", "Petrosyan", "petros1995@gmail.com,", Language.RU);

        //String lang = user.getLanguage().name(); // Enumic String stanalu hamar
        // System.out.println(lang);
    }
}
