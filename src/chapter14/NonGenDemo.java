package chapter14;
//продемонстрировать необобщенный класс

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;
        // создать объект типа NonGenи сохранить в нем объект типа Integer. Выполняется автоупаковка
        iob = new NonGen(88);
        // показать тип данных, хранящихся в переменной iOb
        iob.showType();
        // получить значение переменной iOb, на этот раз требуется приведение типов
        int v = (Integer) iob.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        // создать другой объект типа NonGen и сохранить в нем объект типа String
        NonGen strOb= new NonGen("Tecт без обобщений");
        // показать тип данных, хранящихся в переменной strOb
        strOb.showType();
        //получить значение переменной strOb, и в этом случае потребуется приведение типов
        String str = (String) strOb.getOb();
        System.out.println("Знaчeниe: " + str);
        //Этот код компилируется, но он принципиально неверный!
        iob = strOb;
        v = (Integer) iob.getOb(); // Ошибка во время выполнения!

    }
}
