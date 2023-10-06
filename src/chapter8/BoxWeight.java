package chapter8;

public class BoxWeight extends  Box {
    //расширить класс Вох, включив в него поле веса
    double weight;   // вес параллелепипеда


    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    //конструктор конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d); //вызвать конструктор суперкласса
        weight = m;
    }

    // конструктор, применяемый по умолчанию
    BoxWeight () {
        super();
        weight = -1;
    }
   // конструктор, применяемый при создании куба
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }

}
