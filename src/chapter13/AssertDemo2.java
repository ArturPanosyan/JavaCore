package chapter13;
// Неудачное применение оператора assert! ! !
public class AssertDemo2 extends Assert {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
           // assert (n = getNum()) > 0;  //  Неудачная идея!
            System.out.println("n is " + n);
        }
    }
}
