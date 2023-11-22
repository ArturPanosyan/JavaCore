package chapter14;
//продемонстрировать применение обобщенного класса
public class GenDemo {
    public static void main(String[] args) {
        //Создать ссылку типа Gen для целых чисел
        Gen<Integer> integerGen;
        /* Создать объект типа Gen<Integer> и присвоить ссылку на него переменной integerGen. Обратите внимание на
           применение автоупаковки для инкапсуляции значения 88  в объекте типа Integer */
        integerGen = new Gen<>(88);
        //показать тип данных, хранящихся в переменной integerGen
        integerGen.showType();
        //получить значение переменной integerGen. Обратите внимание на то, что для этого не требуется никакого приведения типов
        int v = integerGen.getOb();
        System.out.println("Знaчeниe: " + v);
        System.out.println();

        // создать объект типа Gen для символьных строк
        Gen<String> stringGen = new Gen<>("Тест обобщений");
        // показать тип данных, хранящихся в переменной stringGen
        stringGen.showType();
        //получить значение переменной stringGen. И в этом случае приведение типов не требуется
        String string = stringGen.getOb();
        System.out.println("Знaчeниe: " + string);



    }
}
