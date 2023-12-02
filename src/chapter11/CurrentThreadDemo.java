package chapter11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: " + thread);
        // изменить имя потока исполнения
        thread.setName("My Thread");
        System.out.println("Пocлe изменения имени потока: " + thread);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
