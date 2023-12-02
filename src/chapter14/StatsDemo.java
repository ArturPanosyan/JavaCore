package chapter14;

//В этой версии класса Stats аргумент типа Т должен
// быть классом NumЬer или наследуемым от него классом
public class StatsDemo<T extends Number> {
    T[] nums;  // nums - это массив элементов типа Т

    //передать конструктору ссылку на массив элементов класса NumЬer или его подкласса
    StatsDemo(T[] o) {
        nums = o;
    }

    // возвратить значение типа douЫe в любом случае
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
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
