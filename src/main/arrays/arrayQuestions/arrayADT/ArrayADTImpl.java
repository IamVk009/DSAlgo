package main.arrays.arrayQuestions.arrayADT;

public class ArrayADTImpl implements ArrayADT {

    private int[] arr;
    private int index;
    private int size;

    public ArrayADTImpl(int size) {
        if (size <= 0) throw new IllegalArgumentException("Size must be greater than zero.");
        this.index = 0;
        this.size = size;
        this.arr = new int[this.size];
    }

    @Override
    public void insert(int value) {
        if (index == this.size) {
            System.out.println("Cannot insert: Array has reached its maximum capacity.");
            return;
        }
        arr[index] = value;
        index++;
    }

    @Override
    public void delete(int deleteIndex) {
        if (deleteIndex < 0 || deleteIndex >= index) {
            System.out.println("Invalid delete index.");
            return;
        }
        for (int i = deleteIndex; i < index - 1; i++) {
            arr[i] = arr[i + 1];
        }
        index--;
    }

    @Override
    public int search(int element) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == element) return i;
        }
        return -1;
    }

    @Override
    public int getData(int elementIndex) {
        if (elementIndex < 0 || elementIndex >= index) return -1;
        return arr[elementIndex];
    }

    @Override
    public void traverse() {
        for (int i = 0; i < index; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }

    @Override
    public void update(int elementIndex, int element) {
        if (elementIndex < 0 || elementIndex >= index) {
            System.out.println("Invalid element index.");
            return;
        }
        arr[elementIndex] = element;
    }

    @Override
    public int currentSize() {
        return this.index;
    }
}
