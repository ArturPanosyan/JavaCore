package dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;
    int index;


    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }


    void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public int getByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println(" Wrong Index ");
            return 0;
        }
        return array[index];
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }



    public void deleteByIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Wrong item");
            return;
        }
        for (int i = index + 1; i <= size; i++) {
            array[i - 1] = array[i];
        }
        size--;

    }


    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println(" Wrong Index");
            return;
        }
        array[index] = value;

    }

    public void add(int index, int value) {
        if (index <= 0 || index >= size) {
            System.out.println("Wrong Index ");
            return;
        }
        if (size == array.length) {
            extend();
        }

        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }


    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }


    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
