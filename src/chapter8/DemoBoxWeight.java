package chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox1 = new BoxWeight(2, 3,4, 0.076);
        double vol;

        vol = mybox.volume();
        System.out.println("Oбъeм mybox равен " + vol);
        System.out.println("Вес mybox равен " + mybox.weight);
        System.out.println();

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        System.out.println("Вес mybox1 равен " + mybox1.weight);
    }
}
