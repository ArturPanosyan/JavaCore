package chapter5;

public class ContinueLabel {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ( j > i) {
                    System.out.println();
                    continue  outer;
                }
                System.out.print(" " + ( i * j));
            }
        }
        System.out.println();
        //В данном примере оператор continue прерывает цикл подсчета значений переменной
        //  j и продолжает его со следующего шага цикла, в котором подсчитываются
        // значения переменной i.
    }
}
