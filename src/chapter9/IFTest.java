package chapter9;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack = new FixedStack(5);
        FixedStack mystack1 = new FixedStack(8);
        // разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack.push(i);
        for (int i = 0; i < 8; i++) mystack1.push(i);
        // извлечь эти числа из стека
        System.out.println("Stack or mystack: ");
        for (int i = 0; i < 5; i++)
            System.out.println(mystack.pop());
        System.out.println("Stack or mystack1: ");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack1.pop());
        }
        }

            



