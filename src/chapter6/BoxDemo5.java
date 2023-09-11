package chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        // инициализировать каждый экземпляр класса Вох

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объем первого параллелепипеда

        vol = mybox1.volume;
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println( " Объем равен " + vol);

        vol = mybox2.volume;
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println(" Объем равен " + vol);


    }
}
