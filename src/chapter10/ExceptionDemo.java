package chapter10;

public class ExceptionDemo {
    static  void compute(int a) throws MyException {
        System.out.println("Bызвaн метод compute(" + a + ")");
        if(a > 10) {
            throw new MyException(a);
        }
        System.out.println("Hopмaльнoe завершение: ");
    }
}
