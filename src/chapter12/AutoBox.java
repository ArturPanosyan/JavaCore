package chapter12;

public class AutoBox {
    public static void main(String[] args) {
        Integer iob = 100;  // автоупаковка значения типа int
        int i = iob;     // автораспаковка значения типа int
        System.out.println(i + " " + iob);   // выводит значения 100 и 100

    }
}
