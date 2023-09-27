package chapter5;

public class IfElse {
    public static void main(String[] args) {
        int month = 4;
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "Зиме";

        else if (month == 3 || month == 4 || month == 5)
            season = "Весне";
        else if (month == 6 || month == 7 || month == 8)
            season = "Лету";
        else if (month == 9 || month == 10 || month == 11)
            season = "Осени";
        else
            season = "вымышленным месяцам";
        System.out.println("Апрель относится к " + season + " . ");


    }

    public static class BreakErr {
        public static void main(String[] args) {
            one:
            for (int i = 0; i < 3; i++) {
                System.out.print(" Проход " + i + " : ");

            }
            for (int j = 0; j < 100; j++) {
            if(j == 10) break; //one; //ОШИБКА!
                System.out.print(j +" ");
            }
        }
    }
}
