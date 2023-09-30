package chapterr7;

public class Outer {
    int OuterX = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
        // это внутренний класс
        class Inner {
            void display() {
                System.out.println(" вывод: OuterX = " + OuterX);
            }
        }
    }

    class InnerClassDemo {
        public static void main(String[] args) {
            Outer outer = new Outer();
            outer.test();

        }
    }

