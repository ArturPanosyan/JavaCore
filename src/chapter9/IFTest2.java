package chapter9;

public class IFTest2 {
    public static void main(String[] args) {
        DynStack dynStack = new DynStack(5);
        DynStack dynStack1 = new DynStack(8);
        //В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) dynStack.push(i);
        for (int i = 0; i < 20; i++) dynStack1.push(i);

        System.out.println("Cтeк в dynStack:");
        for (int i = 0; i < 12; i++)
            System.out.println(dynStack.pop());
        System.out.println("Cтeк в mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(dynStack1.pop());
    }

}
