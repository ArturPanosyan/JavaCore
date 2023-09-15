package mycode;

import java.util.Scanner;

public class StudentTest1 {
    public static void main(String[] args)
            throws java.io.IOException {

        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя информацию
        System.out.print("Введите имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите отчество: ");
        String patronymic = scanner.nextLine();

        System.out.print("Введите дату рождения (число, месяц, год): ");
        int birthDay = scanner.nextInt();
        int birthMonth = scanner.nextInt();
        int birthYear = scanner.nextInt();

        System.out.print("Введите место обучения: ");
        scanner.nextLine();
        // Чтобы считать символ новой строки после числа года
        String school = scanner.nextLine();

        System.out.print("Введите год начала обучения: ");
        int startYear = scanner.nextInt();

        // Вычисляем текущий год
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);

        // Определяем курс студента
        int course = currentYear - startYear;

        // Определяем год окончания обучения
        int graduationYear = startYear + 4;

        // Выводим информацию
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Отчество: " + patronymic);
        System.out.println("Дата рождения: " + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Место обучения: " + school);
        System.out.println("Курс студента: " + course);
        System.out.println("Год окончания обучения: " + graduationYear);

        // Закрываем Scanner
        scanner.close();
    }

}
