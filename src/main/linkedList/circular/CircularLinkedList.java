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

    /** Insert Node at specific position in Circular Linked List. */
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid Position to insert data..");
            return;
        }

        Node newNode = new Node(data);
        if (head == null){ // If list is empty
            if (position > 0) {
                System.out.println("Invalid Position to insert node..");
            } else {
                head = tail = newNode;
                newNode.next = newNode;
                newNode.prev = newNode;
            }
            return;
        }

        if (position == 0) { // Insert at Beginning
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
            return;
        }

        // Traverse to the desired position
        Node tempNode = head;
        for (int index = 0; index < position - 1; index++) {
            if (tempNode == tail) {
                System.out.println("Position out of bounds");
                return;
            }
            tempNode = tempNode.next;
        }

        if (tempNode == tail) { // Insert at End
            newNode.next = head;
            head.prev = newNode;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            return;
        }

        // Insert at given Position
        newNode.next = tempNode.next;
        tempNode.next.prev = newNode;
        tempNode.next = newNode;
        newNode.prev = tempNode;

//        Time Complexity = O(n) -> Linear Time
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

    /** Delete Node from specific position in Circular Linked List. */
    public void deleteFromPosition(int position) {
        // Invalid Position
        if (position < 0) {
            System.out.println("Invalid Position to Delete Node");
            return;
        }

        // If List is Empty.
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        // If List has only one Node
        if (head == tail) {
            if (position == 0) {
                head = tail = null;
            } else {
                System.out.println("Position out of Bounds");
            }
            return;
        }

        // Delete from Beginning
        if (position == 0) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }

        Node tempNode = head;
        for (int index = 0; index < position - 1; index++) {
            if (tempNode == tail) {
                System.out.println("Position out of Bounds.");
                return;
            }
            tempNode = tempNode.next;
        }

        // Delete from End.
        if (tempNode.next == tail) {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            return;
        }

        // Checks if postion is out of bounds.
        if (tempNode.next == head) {
            System.out.println("Position out of Bounds");
            return;
        }

        // Delete from given Position
        tempNode.next = tempNode.next.next;
        tempNode.next.prev = tempNode;

        // Time Complexity = O(n) -> Linear Time
    }

    /** Search Node in Circular Linked List. */
    public boolean search(int data) {

        if (head == null) {
            System.out.println("List is Empty");
            return false;
        }

        Node tempNode = head;
        do {
            if (tempNode.data == data) return true;
            tempNode = tempNode.next;
        } while (tempNode != head);

        System.out.println("Data Not Present in the List");
        return false;

        // Time Complexity = O(n) -> Linear Time
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
