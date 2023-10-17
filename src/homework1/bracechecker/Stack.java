package homework1.bracechecker;

public class Stack {
    //  private  int stck[] = new int[10];
    //  private int tos;


    //  // инициализировать вершину стека
    Stack() {
        ////     tos = -1;
    }


    // разместить элемент в стеке

    // void push(int item) {
    //    if (tos == 9)
    //         System.out.println(" Cтeк заполнен. ");
    //  else
    //       stck[++tos] = item;
    // }

    // извлечь элемент из стека
    //  int pop() {
    //   if (tos < 0) {
    //    System.out.println(" Cтeк не загружен. ");
    //     return 0;
    // } else
    //     return stck[tos--];


        private char[] array;
        private int top;

        public Stack(int capacity) {
            array = new char[capacity];
            top = -1;
        }

        public void push(char value) {
            if (top < array.length - 1) {
                array[++top] = value;
            } else {
                System.out.println("Stack overflow");
            }
        }

        public char pop() {
            if (top >= 0) {
                return array[top--];
            } else {
                return 0;
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
