package chapterr7;

public class Outer1 {
    // Определить внутренний класс в цикле for
    int outer1X = 100;

     void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println(" вывод: outer1X" +
                            outer1X);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }

        class InnerClassDemo {
            public static void main(String[] args) {
                Outer1 outer = new Outer1();
                outer.test () ;
            }
        }
    }
}
