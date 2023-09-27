package bracechecker;

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



    public boolean isEmpty() {
        return (top == -1);
    }
}













