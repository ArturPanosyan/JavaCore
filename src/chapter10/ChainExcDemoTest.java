package chapter10;

public class ChainExcDemoTest extends ChainExcDemo {
    public static void main(String[] args) {
        try{
            demoProc();
        } catch (NullPointerException e) {
            // вывести исключение верхнего уровня
            System.out.println("Пepexвaчeнo исключение: "  + e);

            // вывести исключение, послужившее причиной
            // для исключения верхнего уровня
            System.out.println("Пepвoпpичинa: "  + e.getCause());
        }
    }
}
