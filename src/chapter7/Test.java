package chapter7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;

    }
    // возвратить логическое значение true, если в качестве параметра о указан вызывающий объект

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }


    //Аргументы примитивных типов передаются по значению
    void meth(int i, int j) {
        i *= 2;
        j /= 2;

    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;

    }

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    int y;
    public int c;
    private int e;

    // методы доступа к члену с данного класса
    void setc (int i) {
        e = i;
    }
    int getc() {
        return e;

    }


}


