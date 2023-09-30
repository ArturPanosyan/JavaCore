package chapterr7;

import chapter7.Test;

public class TestStack {
    public static void main(String[] args) {
        Stack mystack = new Stack(5);
         Stack mystack1 = new Stack(8);

        //разместить числа в стеке 
        for (int i = 0; i <5 ; i++) mystack.push(i);
        for (int i = 0; i < 8; i++) mystack1.push(i);

        // извлечь эти числа из стека
        System.out.println("Stack or mystack:" );
        for (int i = 0; i < 5; i++)
            System.out.println(mystack.pop());
        System.out.println("Stack or mystack1:" );
        for (int i = 0; i < 8; i++)
            System.out.println(mystack1.pop());

        }
            
        }

