package homework1.bracechecker;

public class BraceCheckerTest {
    public static void main(String[] args) {


        String text = "SayHello [f{}{{{r}om} {java] ";
        BraceChecker braceChecker = new BraceChecker(text);
        BraceChecker braceChecker1 = new BraceChecker(text);
        braceChecker.check();
        String str = "SayHello [from} {java] ";
        braceChecker1.check();



    }

}