package chapter13;

public class AssertDemo extends Assert {
    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getNum();
            assert n > 0;  // подтвердится, если n == 0
            System.out.println("n равно " + n);
        }
    }
}
