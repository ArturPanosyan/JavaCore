package Arrayutil;

public class ArrayUtil {

    int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

    void arrayOne() {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

    void arrayTwo() {
        System.out.println("Первый элемент: " + numbers[0]);

    }

    void arrayThree() {
        System.out.println("Последний элемент: " + numbers[numbers.length - 1]);

    }

    void arrayFour() {
        System.out.println("Длина массива: " + numbers.length);

    }


    void arrayFive() {
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Самое маленькое число: " + min);

    }


    void array6() {
        if (numbers.length < 3) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 0) {
            System.out.println("Средние числа: " + numbers[numbers.length / 2 - 1] + " и " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Среднее число: " + numbers[numbers.length / 2]);
        }

    }

    void array7() {
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Количество четных чисел: " + evenCount);

    }


    void array8() {
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Количество нечетных чисел: " + oddCount);

    }


    void array9() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Avg: " + (double) (sum / numbers.length));
    }

    public  static  int max(int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
            
        }
        return  max;

    }

}














