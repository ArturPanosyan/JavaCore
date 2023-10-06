package chapter8;

public class BdemoSuper extends AdemoSuper {
    // создать подкласс путем расширения класса АDemoSuper
    int i; // этот член i скрывает член i из класса АdemoSuper

    BdemoSuper(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("Члeн i в суперклассе: " + super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }
}
