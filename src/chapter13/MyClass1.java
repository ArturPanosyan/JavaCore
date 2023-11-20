package chapter13;

public class MyClass1 extends MyClass{
    int a, b;
    // инициализировать поля а и Ь по отдельности
    MyClass1(int i, int j) {
        a = i;
        b = j;
    }
        // инициализировать поля а и Ь одним и тем же значением
        MyClass1(int i){
            this(i, i);
        }

        MyClass1(){
        this (0);
        }
    }

