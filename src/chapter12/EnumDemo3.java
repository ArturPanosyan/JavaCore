package chapter12;

import java.sql.SQLOutput;

//Использовать конструктор, переменную экземпляра и метод в перечислении
public class EnumDemo3 {
    public static void main(String[] args) {
       Apple apple;
        // вывести цену на яблоко сорта WINESAP
        System.out.println("Яблoкo сорта WINESAP стоит " + Apple.WINESAP.getPrice() + " центов.\n ");
        // вывести цены на все сорта яблок
        System.out.println("Цeны на все сорта яблок:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " стоит " + a.getPrice() + " центов.");
            
        }
    }
}
