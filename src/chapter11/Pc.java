package chapter11;

public class Pc {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Для остановки нажмите Ctrl-C.");
    }
}
