package classwork.chapter9;

public interface MyInterface {
    int a = 10;


    static void printHello() {
        printNewLine();
    }

    static void printGoodBy() {
        printNewLine();
    }

    private static void printNewLine() {
        System.out.println();
    }

}