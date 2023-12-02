package chapter11;

//Приостановка и возобновление исполнения потока современным способом
public class NewThread3 implements Runnable {
    String name;
    Thread t;
    boolean suspendFlag;

    NewThread3(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Hoвый поток: " + t);
        suspendFlag = false;
        t.start();    // запустить поток исполнения
    }
    // Точка входа в поток исполнения


    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }

                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " завершен.");
    }

    synchronized  void mySuspend(){
        suspendFlag = true;
    }

    synchronized  void myResume(){
        suspendFlag = false;
        notify();
    }
}