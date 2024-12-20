package main.linkedList.circular;

public class CircularLinkedList {
    Node head = null;
    Node tail = null;

    /** Insert Node at Beginning of Circular Linked List. */
    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            return;
        }

        newNode.next = head;
        newNode.prev = tail;

        head.prev = newNode;
        tail.next = newNode;

        head = newNode;

//        Time Complexity = O(1) -> Constant Time
    }

    /** Insert Node at End of Circular Linked List. */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
            return;
        }

        newNode.prev = tail;
        newNode.next = head;

        head.prev = newNode;
        tail.next = newNode;

        tail = newNode;

//        Time Complexity = O(1) -> Constant Time
    }

    /** Delete Node from Start of Circular Linked List. */
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("Circular Linked List is Empty..");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        head = head.next;
        tail.next = head;
        head.prev = tail;

//        Time Complexity = O(1) -> Constant Time
    }

    /** Delete Node from End of Circular Linked List. */
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("Circular Linked List is Empty..");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = head;
        head.prev = tail;

//        Time Complexity = O(1) -> Constant Time
    }

    /** Display Circular Linked List from Head to Tail. */
    public void displayForward() {
        if (head == null) {
            System.out.println("Circular Linked List is Empty..");
            return;
        }

        if (head == tail) {
            System.out.println(head.data);
            return;
        }

        Node tempNode = head;
        while (true) {
            System.out.print(tempNode.data);
            tempNode = tempNode.next;

            if (tempNode == head) {
                break;
            }
            System.out.print(" <=> ");
        }
        System.out.println();

//        Time Complexity = O(n) -> Linear Time
    }

    /** Display Circular Linked List from Tail to Head. */
    public void displayBackwards() {
        if (head == null) {
            System.out.println("Circular Linked List is Empty..");
            return;
        }

        if (head == tail) {
            System.out.println(head.data);
            return;
        }

        Node tempNode = tail;
        while (true) {
            System.out.print(tempNode.data);
            if (tempNode == head) {
                break;
            }
            tempNode = tempNode.prev;
            System.out.print(" <=> ");
        }
        System.out.println();

//        Time Complexity = O(n) -> Linear Time
    }
}
