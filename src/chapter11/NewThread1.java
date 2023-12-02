package chapter11;

public class NewThread1 extends Thread {
    Thread t;

    NewThread1(){
        // создать новый, второй поток исполнения
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дoчepний поток создан: " + t);
        t.start();  // запустить поток исполнения
    }
    // Точка входа во второй поток исполнения

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0 ; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Дoчepний поток завершен.");
    }
}
