package chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox1 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox2 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox);
        double vol;

        vol = mybox.volume();
        System.out.println("Объем mybox равен " + vol);
        System.out.println("Вес mybox равен " + mybox.weight);
        System.out.println();

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        System.out.println("Вес mybox равен " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        System.out.println("Вес mybox2 равен " + mybox2.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone равен " + vol);
        System.out.println("Вес myclone равен " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
        System.out.println("Вес mycube равен " + mycube.weight);
        System.out.println();
    }
}
