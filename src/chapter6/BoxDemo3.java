package chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;


        // присвоить значение переменным экземпляра myboxl
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // вывести объем первого параллелепипеда myboxl.volume();

        myBox1.volume();


        // вывести объем второго параллелепипеда mybox2. volume ();

        myBox2.volume();
    }
}
