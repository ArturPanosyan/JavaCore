package chapter12;


public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;
        apple = Apple.REDDEL;
        // вывести значение перечислимого типа
        System.out.println("Знaчeниe apple: " + apple);
        System.out.println();

        apple = Apple.GOLDENDEL;
        // сравнить два значения перечислимого типа
        if (apple == Apple.GOLDENDEL) {
            System.out.println("Переменная арple содержит GOLDENDEL.\n");
            // применить перечисление для управления оператором switch
            switch (apple) {
                case JONATHAN:
                    System.out.println("Сорт JONATHAN красный: ");
                    break;
                case GOLDENDEL:
                    System.out.println("Сорт GOLDEN DELICIOUS желтый: ");
                    break;
                case REDDEL:
                    System.out.println("Сорт RED DELICIOUS красный:");
                    break;
                case WINESAP:
                    System.out.println("Сорт WINESAP красный:");
                    break;
                case CORTLAND:
                    System.out.println("Copт CORTLAND красный.");
                    break;
            }

        }
    }
}