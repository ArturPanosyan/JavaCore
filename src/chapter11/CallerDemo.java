package chapter11;

public class CallerDemo implements Runnable {
    String msg;
    CallMeDemo target;
    Thread t;

    public CallerDemo(CallMeDemo targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            // синхронизированный блок
            target.call(msg);

        }
    }
}