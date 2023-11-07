package classwork.chapter3;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[50];

        for (int i = 0; i < 50; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < 50; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
