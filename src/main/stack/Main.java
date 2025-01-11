package main.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(30);
        stack.push(40);
        stack.push(110);
        stack.push(10);
        stack.displayElement();
        System.out.println();
        System.out.println("Pop = " + stack.pop());
        System.out.println("Peek = " + stack.peek());
    }
}
