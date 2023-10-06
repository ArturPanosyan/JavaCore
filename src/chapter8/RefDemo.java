package chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = boxWeight.volume();
        System.out.println("Объем boxWeight равен " + vol);
        System.out.println("Bec boxWeight равен " + boxWeight.weight);
        System.out.println();

        // присвоить переменной ссылки на объект типа BoxWeight ссылку на объект типа Вох

        plainbox = boxWeight;
        vol = plainbox.volume(); // Верно, так как метод volume() определен в классе Вох
        System.out.println("Объем plainbox равен " + vol);

        // Следующий оператор ошибочен, поскольку член plainbox не определяет член weight.
        System.out.println("Вес plainbox равен" + " " + vol); //plainbox.weight) ;

    }
}
