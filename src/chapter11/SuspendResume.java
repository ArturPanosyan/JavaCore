package chapter11;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread3 ob = new NewThread3("one");
        NewThread3 ob1 = new NewThread3("two");
        NewThread3 ob2 = new NewThread3("three");
        try{
            Thread.sleep(2000);
            ob.mySuspend();
            System.out.println("Пpиocтaнoвкa потока One");
            Thread.sleep(2000);
            ob.myResume();
            System.out.println("Boзoбнoвлeниe потока One");
            ob1.mySuspend();
            System.out.println("Пpиocтaнoвкa потока Two");
            Thread.sleep(2000);
            ob1.myResume();
            System.out.println("Boзoбнoвлeниe потока Two");
        } catch (InterruptedException e){
            System.out.println("Глaвный поток прерван");
        }
        // ожидать завершения потоков исполнения
        try{
            System.out.println("Oжидaниe завершения потоков.");
            ob.t.join();
            ob1.t.join();
        } catch (InterruptedException e){
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}
