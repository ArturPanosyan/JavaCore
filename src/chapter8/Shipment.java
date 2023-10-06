package chapter8;

public class Shipment  extends BoxWeight {
    double cost;
    // сконструировать клон объекта
    Shipment (Shipment ob) {
        super(ob);
        cost = ob.cost;

    }

    // конструктор, используемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m); //вызвать конструктор суперкласса
            cost = c;
        }

        // конструктор, применяемый по умолчанию
    Shipment(){
        super();
        cost = -1;
    }

    // конструктор, применяемый при создании куба
    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
