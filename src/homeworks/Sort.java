package homeworks;


public class Sort {

    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Обмен элементов
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        // сортировка элементов
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}