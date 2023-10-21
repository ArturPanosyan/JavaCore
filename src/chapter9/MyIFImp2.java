package chapter9;

public class MyIFImp2 implements MyIF {
    // В этом классе предоставляются реализации обоих методов getNumЬer() и getString()

    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return  "Это другая символьная строка.";
    }
}
