package chapter6;

import chapter6.Box;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox = new Box(10, 20, 15);
        Box mybox1 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox);
        double vol;

        // получить объем первого параллелепипеда
        vol = mybox.volume();
        System.out.println(" Объем mybox равен " + vol);
        // получить объем второго параллелепипеда
        vol = mybox1.volume();
        System.out.println(" Объем mybox1 равен "+ vol);
        //получить объем куба
       vol = mycube.volume();
        System.out.println(" Объем mybox2 равен " + vol);
        // получить объем клона
        vol = myclone.volume();
        System.out.println("Oбъeм клона равен " + vol);
    }
}
