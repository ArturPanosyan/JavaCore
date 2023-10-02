package classwork.chapter7;

import Arrayutil.ArrayUtil;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers dividet ,");
        String numbersStr = scanner.nextLine();
        String[] numbersStrArray = numbersStr.split(",");
        int [] numbers = new int[numbersStrArray.length];
        int index = 0;
        for (String numberStr : numbersStrArray) {
            numbers[index++] = Integer.parseInt(numberStr);
        }
        int max = ArrayUtil.max(numbers);
        System.out.println("Max: " + max);


    }
}