package homework;

public class Average {
    public static void main(String[] args) {
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double sum = 0;
        int i;
        for (i = 0; i < 5; i++)
        sum = sum + nums[i];
        System.out.println("среднее значение равно" + sum / 5);



}
}

