package chapter6;

public class Box {

    double width;
    double height;
    double depth;

    //Обратите внимание на этот конструктор. В качестве//параметра в нем используется объект типа Вох


Box(Box ob) {
    width = ob.width;
    height = ob.height;
    depth = ob.depth;
}

        // конструктор, используемый, если ни один из
//размеров не указан



    //конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }





        //Это конструктор класса Вох
    // Конструктор по умолчанию инициализирует все переменные экземпляра
    //устанавливаемыми по умолчаниюзначениями, которые могут быть нулевыми, пустыми
    // (null) и логическими (false) для числовых, ссылочных и логических (boolean) типов соответственно.

    //  Как только в классе будет определен собственный конструктор,
    // конструктор по умолчанию больше не используется.

    //Это конструктор класса Вох
    //В данном примере программы для инициализации размеров параллелепипеда в классе
     // Вох применяется параметризированный конструктор

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }





    double volume() {
        return width * height * depth;

    }





    Box() {
        System.out.println(" Koнcтpyиpoвaниe объекта Вох ");
        width = 10;
        height = 10;
        depth = 10;
    }




    // double volume;


    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;

    }

}


