package chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox

        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        // рассчитать объем параллелепипеда

        vol = myBox.width * myBox.depth * myBox.height;
        System.out.println("Oбъeм равен " + vol);

    }
}
