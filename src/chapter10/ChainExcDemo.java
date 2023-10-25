package chapter10;
// Продемонстрировать цепочки исключений
public class ChainExcDemo {
    static  void demoProc (){
        //создать исключение
        NullPointerException e = new NullPointerException("вepxний уровень");
        // добавить причину исключения
        e.initCause(new ArithmeticException("причинa"));

        throw  e;
    }
}
