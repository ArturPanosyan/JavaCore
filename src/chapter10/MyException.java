package chapter10;
// В этой программе создается специальный тип исключения
public class MyException extends Exception{
     private int detail;
     MyException(int a){
         detail = a;
     }

     public String toString(){
         return "My Exception[" + detail + "]";
     }
}
