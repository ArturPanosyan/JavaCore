package chapter10;
//Продемонстрировать многократный перехват
public class MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] vals = {1, 2, 3 };
        try{
            int result = a / b ; // сгенерировать исключение типа ArithmeticException
            vals[10] = 19; //сгенерировать исключение типа ArrayindexOutOfBoundsException
            // В этом операторе catch перехватываются оба исключения
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Иcключeниe перехвачено: " + e);
        }
        System.out.println("Пocлe многократного перехвата.");
    }
}
