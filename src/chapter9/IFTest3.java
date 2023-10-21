package chapter9;

public class IFTest3 {
    // Создать переменную интерфейса и обратиться к стекам через нее.
    public static void main(String[] args) {
        IntStack myStack;
        //создать переменную ссылки на интерфейс
        DynStack dynStack = new DynStack(5);
        FixedStack fixedStack = new FixedStack(8);

        myStack = dynStack;
        // загрузить динамический стек разместить числа в стеке
        for (int i = 0; i < 12; i++) myStack.push(i);
        myStack = fixedStack;
        // загрузить фиксированный стек
        for (int i = 0; i < 8; i++) myStack.push(i);
        myStack = dynStack;
        System.out.println("Знaчeния в динамическом стеке:");
        for (int i = 0; i < 12; i++) {
            System.out.println(myStack.pop());
        }
        myStack = fixedStack;
        System.out.println("Знaчeния в фиксированном стеке:");
        for (int i = 0; i < 8; i++) {
            System.out.println(myStack.pop());
        }
    }
}
