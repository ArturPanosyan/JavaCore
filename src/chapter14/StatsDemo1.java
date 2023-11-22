package chapter14;

public class StatsDemo1 <T extends Number> {
    T[] nums;  // nums - это массив элементов типа Т

    //передать конструктору ссылку на массив элементов класса NumЬer или его подкласса
    StatsDemo1(T[] o) {
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

}
