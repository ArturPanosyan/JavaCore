package chapter11;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread2 ob = new NewThread2("One");
        NewThread2 ob1 = new NewThread2("Two");
        NewThread2 ob2 = new NewThread2("Three");
        System.out.println("Пoтoк Один запущен: " + ob.t.isAlive());
        System.out.println("Пoтoк Два запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк Три запущен: " + ob2.t.isAlive());
        // ожидать завершения потоков исполнения
        try{
            System.out.println("Oжидaниe завершения потоков.");
            ob.t.join();
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e){
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Пoтoк Один запущен: " + ob.t.isAlive());
        System.out.println("Пoтoк Два запущен: " + ob1.t.isAlive());
        System.out.println("Пoтoк Три запущен: " + ob2.t.isAlive());
        System.out.println("Глaвный поток завершен.");
    }
}
