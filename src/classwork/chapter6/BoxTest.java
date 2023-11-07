package classwork.chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box myBox = new Box(3, 5, 6);
        System.out.println(Box.ISO_NUMBER);
        System.out.println(myBox.width);
        System.out.println(myBox.height);
        System.out.println(myBox.depth);
        myBox.width = 100;
        myBox = new Box(20, 60, 70);
//
//        Box myBox2 = new Box();
//        myBox.width = 8.8;
//        System.out.println(myBox2.depth);
//        System.out.println(myBox2.height);
//        System.out.println(myBox2.width);
    }
}
