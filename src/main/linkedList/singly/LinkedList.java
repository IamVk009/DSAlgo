package main.linkedList.singly;

public class LinkedList {

    Node head = null;

     /** Insert Node at Beginning of Singly Linked List. */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        newNode.next = head;           // Point the new node's next to the current head
        head = newNode;                // Update head to point to the new node
    }

    /** Insert Node at End of Linked list. */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }

        tempNode.next = newNode;
    }

    /** Insert Data in a Node at specific position in Linked List. */
    public void insertAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        Node newNode = new Node(data);

        // Handle empty list or inserting at position 0
        if (head == null) {
            if (position == 0) {
                head = newNode;
            } else {
                System.out.println("Position out of Bounds");
            }
            return;
        }

        // Special case: Insert at the beginning
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node tempNode = head;
        int index = 0;

        while (tempNode.next != null) {
            index++;
            if (index == position) {
                break;
            }
            tempNode = tempNode.next;
        }

        if (tempNode.next == null) {
            System.out.println("Position Out of Bound ..");
            return;
        }

        newNode.next = tempNode.next;
        tempNode.next = newNode;
    }

    /** Print all the Nodes of Linked List. */
    public void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" ==> ");
            }
            temp = temp.next;
        }
        System.out.print(" ==> null");
    }

    /** Delete first Node from Linked List. */
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("Linked List is Empty..");
            return;
        }
        head = head.next;
    }

    /** Delete last Node from Linked List. */
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("Linkedlist is Empty..");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node tempNode = head;

        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
    }

    /** Delete Node at specific position from Linked List. */
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("Linkedlist is empty..");
            return;
        }

        if (position < 0) {
            System.out.println("Invalid position to delete data");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node tempNode = head;
        for (int i = 0; i < position - 1; i++) {
            if (tempNode == null || tempNode.next == null) {
                System.out.println("Position out of Bounds..");
                return;
            }
            tempNode = tempNode.next;
        }

        if (tempNode.next != null) {
            tempNode.next = tempNode.next.next;
        } else {
            System.out.println("Position out of Bounds..");
        }
    }

    /** Search Node in Linked List. */
    public boolean search(int data) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.data == data) {
                return true;
            }
            tempNode = tempNode.next;
        }
        return false;
    }
}
