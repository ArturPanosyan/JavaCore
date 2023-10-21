package chapter9;

public class B implements A.NestedIF {
    // Класс В реализует вложенный интерфейс

    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
