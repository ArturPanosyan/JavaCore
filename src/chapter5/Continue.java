package chapter5;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) continue;

            // данном примере кода операция % служит для проверки четности значения
            //переменной i. Если это четное значение, то выполнение цикла продолжается без
            //перехода на новую строку.

            System.out.println(" ");

            //Как и оператор break, оператор continue может содержать метку объемлющего
            // цикла, который требуется продолжить. Ниже приведен пример программы,
            // в которой оператор continue применяется для вывода треугольной таблицы ум
            // ножения чисел от О до 9.
        }
    }
}
