package main.stack;

public class Stack {
    private int[] array;
    private int maxSize;
    private int top = 0;

    public Stack(int size) {
        this.maxSize = size;
        array = new int[maxSize];
        top = -1;
    }

    // Push Operations
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is Full!");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }

    // Display
    public void displayElement() {
        if (top == -1) {
            System.out.println("Stack is empty!!");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
