package homework1.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {


        String text = "Hello [f{}{{{r}om} {java] ";
        BraceChecker braceChecker = new BraceChecker(text);
        BraceChecker braceChecker1 = new BraceChecker(text);
        braceChecker.check();
        String str = "Hello [from} {java] ";
        braceChecker1.check();



    }

}