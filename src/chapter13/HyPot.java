package chapter13;
// Вычислить длину гипотенузы прямоугольного треугольника
public class HyPot {
    public static void main(String[] args) {
        double side1, side2;
        double hyPot;
        side1 = 3.0;
        side2 = 4.0;

        /*Обратите внимание на то, что имена методов sqrt()
         и pow() должны быть уточнены именем их класса Math */
        hyPot = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("Пpи заданной длине сторон " + side1 + " и " + side2 + "гипотенуза равна " + hyPot);

    }
}
