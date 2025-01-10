package main.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.displayElement();
    }
}
