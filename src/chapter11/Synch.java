package chapter11;

public class Synch {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller ob = new Caller(target, "Добро пожаловать");
        Caller ob1 = new Caller(target, "в синхронизированный");
        Caller ob2 = new Caller(target, "мир!");
        // ожидать завершения потока исполнения
        try{
            ob.t.join();
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
