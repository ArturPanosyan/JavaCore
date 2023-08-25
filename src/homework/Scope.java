package homework;

public class Scope {
    public static void main(String[] args) {
        byte x = 100;
        byte y = 110;
        System.out.println(x * y);
        System.out.println();
        int a = 300;
        float d = 330.5f;
        double i = (a * d) / x;
        System.out.println(i);
        System.out.println();
        int j = 20;
        int k = 12;
        for (; j < i; j++) {
            System.out.println("j: " + j);
            int l = k * 15;
            char n = '\u0059';
            System.out.println(l);
            System.out.println();




        }


    }}

