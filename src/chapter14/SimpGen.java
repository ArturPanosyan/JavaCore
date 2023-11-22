package chapter14;
// продемонстрировать применение класса ТWoGen
public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "generate");
        // показать типы
        tgObj.showTypes();
        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Знaчeниe: " + v);

        String str = tgObj.ob2;
        System.out.println("Знaчeниe: " + str);

    }
}
