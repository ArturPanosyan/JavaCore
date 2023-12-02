package chapter11;

// Неправильная реализация поставщика и потребителя
public class Q {
 //  int n;
 //  synchronized int get(){
 //      System.out.println("Пoлyчeнo: " + n);
 //      return n;
 //  }
 //  synchronized void put(int n){
 //      this.n = n;
 //      System.out.println("Oтпpaвлeнo: " + n);
 //  }
    int n;
    boolean valueSet = false;
    synchronized int get(){
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Иcключeниe типа " + "InterruptedException перехвачено");
            }
        System.out.println("Пoлyчeнo: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e){
                System.out.println("Иcключeниe типа " + "InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Oтпpaвлeнo: " + n);
        notify();
    }
}
