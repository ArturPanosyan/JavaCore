package chapter11;
// Эта программа не синхронизирована
public class CallMe {
    void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("] ");
    }
}
