package chapter12;



// Воспользоваться встроенными в перечисление методами
public class EnumDemo2 {
    public static void main(String[] args) {
        Apple apple;
        System.out.println("Константы перечислимого типа Apple:");
        // применить метод values();
        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
            // применить метод valueOf();
            apple = Apple.valueOf("WINESAP");
            System.out.println("Пepeмeннaя аpрle содержит " + apple);
        }
    }
}
