package chapter8;

public class C  extends  A{
    // переопределить метод callme()

    @Override
    void callme() {
        System.out.println("B методе callme() из класса С");
    }
}
