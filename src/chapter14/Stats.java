package chapter14;
//Класс Stats - пример безуспешой попытки создать обобщенный класс для вычисления среднего значения
// массива чисел заданного типа. Этот класс содержит ошибку!
public class Stats <T> {
    T[] nums;  // nums - это массив элементов типа Т

    //передать конструктору ссылку на массив значений типа Т
    Stats(T[] o) {
        nums = o;
    }

    // возвратить значение типа douЫe в любом случае
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            //  sum += nums[i].doubleValue)();  //ОШИБКА!!!
        }
        return sum / nums.length;
    }
    // метасимвола подстановки
    boolean samAvg(Stats<?> ob) {
        if (average() == ob.average())
            return true;

        return false;
    }
}