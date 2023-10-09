package chapter8;

public class A {
    int i, j;

    void showij() {

        System.out.println("i и j: " + i + " " + j);
    }

    void callme(){
        System.out.println("B методе callme() из класса А");
    }
}
