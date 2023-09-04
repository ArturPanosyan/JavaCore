package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        // 1.
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();

        // 2.
        System.out.println("Первый элемент: " + numbers[0]);
        System.out.println();


        // 3.
        System.out.println("Последний элемент: " + numbers[numbers.length - 1]);
        System.out.println();

        // 4.
        System.out.println("Длина массива: " + numbers.length);
        System.out.println();

        // 5.
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Самое маленькое число: " + min);
        System.out.println();


        // 6.
        if (numbers.length < 3) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 0) {
            System.out.println("Средние числа: " + numbers[numbers.length / 2 - 1] + " и " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Среднее число: " + numbers[numbers.length / 2]);
        }
        System.out.println();


        // 7.
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);
        System.out.println();


        // 8.
        System.out.println("Количество нечетных чисел: " + (numbers.length - evenCount));
        System.out.println();

        // 9.
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println();

        // 10.
        double average = (double) sum / numbers.length;
        System.out.println("Среднее арифметическое: " + average);


    }
}



