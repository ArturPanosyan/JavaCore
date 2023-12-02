package chapter11;

public class Synch1 {
    public static void main(String[] args) {
        CallMeDemo target = new CallMeDemo();
        CallerDemo ob = new CallerDemo(target, "Добро пожаловать");
        CallerDemo ob1 = new CallerDemo(target, "в синхронизированный");
        CallerDemo ob2 = new CallerDemo(target, "мир!");
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

