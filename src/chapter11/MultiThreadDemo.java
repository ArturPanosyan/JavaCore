package chapter11;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread2("One");
        new NewThread2("Two");
        new NewThread2("Three");
        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
            } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Глaвный поток завершен.");
    }
}
