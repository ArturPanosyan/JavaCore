package chapter9;
// Использовать метод с реализацией по умолчанию
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp myIFImp = new MyIFImp();
        //Метод getNumЬer() можно вызвать, так как он явно реализован в классе MyIFimp:
        System.out.println(myIFImp.getNumber());

        //Метод getString() также можно вызвать, так как в интерфейсе имеется его реализация по умолчанию:
        System.out.println(myIFImp.getString());
    }
}
