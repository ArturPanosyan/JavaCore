package chapter10;

public class ExceptionTest extends ExceptionDemo {
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        } catch (MyException m) {
            System.out.println("Пepexвaчeнo исключение: " + m);
        }
    }
}
