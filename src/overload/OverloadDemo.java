package overload;

public class OverloadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;

        // вызвать все варианты метода test()
        ob.test();
        ob.test(10);
        ob.test(10, 20);
        result = ob.test(123.25);
        System.out.println( " Результат вызова ob.test(123.25): "  + result);
    }

}
