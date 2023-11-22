package chapter14;

//продемонстрировать применение класса Stats
public class BoundsDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5};
        StatsDemo<Integer> iob = new StatsDemo<>(inums);
        double v = iob.average();
        System.out.println("Cpeднee значение iob равно " + v);
        Double dnums[] = {1.1, 2.2, 3.3, 4.4, 5.5};
        StatsDemo<Double> dob = new StatsDemo<>(dnums);
        double w = dob.average();
        System.out.println("Cpeднee значение dob равно " + w);

        // Этот код не скомпилируется, так как класс String не является производным от класса NumЬer
        // String strs[] = { "1", "2", "3", "4", "5" };
        // Stats<String> strob = new Stats<String>(strs);
        // douЫe х = strob.average();
        // System.out.println("Cpeднee значение strob равно " + v);
    }
}
