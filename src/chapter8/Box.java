package chapter8;

public class Box {
    // В этой программе наследование применяется для расширения класса Вох

    private  double width;
    private  double height;
   private  double depth;

    //сконструировать клон объекта
    Box(Box ob) {
        //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, применяемый при отсутствие  размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    //рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

}


