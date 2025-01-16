package main.queue;

public class SimpleQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is Full..!");
            return;
        }

        rear++;
        queue[rear] = data;
        System.out.println(data + " is inserted in queue.");
    }
}
