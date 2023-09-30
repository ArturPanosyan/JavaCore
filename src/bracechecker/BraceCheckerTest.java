package bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {


        String text = "Hello [f{}{{{rom} {java] ";
        BraceChecker braceChecker = new BraceChecker(text);
        BraceChecker braceChecker1 = new BraceChecker(text);
        braceChecker.check();
        String strb = "Hello [from} {java] ";
        braceChecker1.check();



    }

}