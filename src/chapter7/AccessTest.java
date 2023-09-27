package chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test (10);
        ob.y = 10;
        ob.c = 20;

        ob.setc(100);
        System.out.println("y, c и e: " + ob.y +
                 " " + ob.c + " " + ob.getc() );

    }
}
