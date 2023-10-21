package chapter9;

public interface IntStack {
    //Определить интерфейс для целочисленного стека
    void push(int item);  //сохранить элемент в стеке

    int pop();    //извлечь элемент из стека


    /*У метода clear() теперь имеется вариант, доступный по умолчанию, и поэтому его придется реализовать
// в том заранее существующем классе, где уже применяется интерфейс IntStack */

    default void clear() {
        System.out.println("Meтoд clear() не реализован.");
    }

    //Очередная версия интерфейса IntStack с закрытым методом, применяемым в двух реализуемых по умолчанию методах.
    default  int[] popNElements(int n) {
        // возвратить запрашиваемые элементы из стека
        return  getElements(n);
    }

    //Метод с реализацией по умолчанию, возвращающий из стека массив из n элементов, следующих после
// указанного количества пропускаемых элементов
     default int[] skipAndPopNElements(int skip, int n){
         //пропустить указанное количество элементов в стеке
         getElements(skip);
         // возвратить запрашиваемые элементы из стека
         return  getElements(n);
     }

    // Закрытый метод, возвращающий массив из n элементов, начиная с вершины стека
     private  int[] getElements(int n) {
        int[] elements = new int[n];
         for (int i = 0; i < n; i++) elements[i] = pop();
             return elements;
         }
    }

