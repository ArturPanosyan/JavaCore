package chapter11;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();  // создать новый поток
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Глaвный поток завершен.");
    }
}
