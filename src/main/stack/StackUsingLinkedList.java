package main.stack;

public class StackUsingLinkedList {

    private Node top;

    public StackUsingLinkedList() {
        this.top = null;
    }

    // Push Operation
    public void push(int data) {
        if (top == null) {
            System.out.println("Stack is Empty");
            return;
        }
        Node node = new Node(10);
        node.next = top;
        top = node;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.data;
    }

}
