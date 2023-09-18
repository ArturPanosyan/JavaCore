package dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.addElement(5);
        dynamicArray.addElement(10);
        dynamicArray.addElement(15);
        dynamicArray.print();


        int elementAtIndex1 = dynamicArray.getByIndex(1);
        System.out.println("Элемент по индексу 1: " + elementAtIndex1);


    }
}

