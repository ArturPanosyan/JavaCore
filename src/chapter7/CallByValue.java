package chapter7;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        int a = 15;
        int b = 20;

        System.out.println(" a и b  до вызова:" + a + " " +  b );

        ob.meth(a,b);

        System.out.println("a и Ь после вызова: " +
                a + " " + b);
    }
}
