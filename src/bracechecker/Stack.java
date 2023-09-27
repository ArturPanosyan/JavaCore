package bracechecker;

public class Stack {


    // инициализировать вершину стека
    Stack() {
    }



    // разместить элемент в стеке

  //  void push(int item) {
    //    if (tos == 9)
    //        System.out.println(" Cтeк заполнен. ");
  //      else
    //        stck[++tos] = item;
  //  }

    // извлечь элемент из стека
   /// int pop() {
  //  /    if (tos < 0) {
      //      System.out.println(" Cтeк не загружен. ");
      //      return 0;
     //   } else
      //      return stck[tos--];

    private int maxSize;

    private char[] stackArray;

    private int top;

    public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char j) {
        stackArray[++top] = j;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}













