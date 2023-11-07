package classwork.chapter5;

public class ForEachExample {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
//        int sum = 0;
//        for (int x :array) {
//            sum += x;
//        }
        System.out.println();
        char[] name = {'a', 'b', 'c'};
        for (char c : name) {
            System.out.print(c + " ");
        }
    }
}
