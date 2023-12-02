package chapter11;
// В этой программе используется синхронизированный блок
public class CallMeDemo {
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
