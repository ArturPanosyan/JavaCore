package chapter8;

public class Triangle  extends  Figure {

    Triangle(double a, double b){
        super(a, b);
    }
    // переопределить метод area() для прямоугольного треугольника
    double area(){
        System.out.println("B области треугольника.");
        return dim1 * dim2 / 2;
    }
}
