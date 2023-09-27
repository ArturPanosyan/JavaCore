package sort;

public class SortDemo {
    public static void main(String[] args) {

        Sort s = new Sort();
        int[] numbers = {4, 7, 1, 3, 9, 0, 2};
        s.sort(numbers);
        for (int number:numbers ) {
            System.out.print(number + " ");

            
        }
    }
}
