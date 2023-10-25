package chapter10;
// Продемонстрировать применение оператора throw
public class ThrowDemo {
    static  void demoProc() {
        try{
            throw  new NullPointerException("дeмoнcтpaция");
        } catch (NullPointerException e) {
            System.out.println("Иcключeниe перехвачено в теле  " + "метода demoproc () . ");
            throw  e;      // повторно сгенерировать исключение
        }
    }

    public static void main(String[] args) {
        try{
            demoProc();
        } catch (NullPointerException e){
            System.out.println("Пoвтopный перехват: " + e);

        }
    }
}
