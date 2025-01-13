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

}