package chapter11;

public class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();
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

