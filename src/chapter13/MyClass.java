package chapter13;

public class MyClass {
    int a, b;
    // инициализировать поля а и Ь по отдельности
    MyClass(int i, int j){
        a = i;
        b = j;
    }

    // инициализировать поля а и Ь одним и тем же значением
    MyClass(int i){
        a = i;
        b = i;
    }

    // присвоить полям а и Ь нулевое значение по умолчанию
    MyClass() {
        a = 0;
        b = 0;
    }
}
