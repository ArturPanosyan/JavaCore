package chapter10;

public class FinallyTest extends FinallyDemo {
    public static void main(String[] args) {
       try{
           procA();
       } catch (Exception e){
           System.out.println("Иcключeниe перехвачено");
       }
           procB();
           procC();
    }
}
