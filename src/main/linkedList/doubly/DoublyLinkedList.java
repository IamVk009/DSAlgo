package main.linkedList.doubly;

public class DoublyLinkedList {

    Node head = null;
    Node tail = null;

    /** Insert Node at Beginning of Doubly Linked List. */
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    /** Insert Node at End of Doubly Linked list. */
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    /** Insert Node at specific position in Doubly Linked List. */
    public void insertAtPosition(int position, int data) {
        if (position < 0) {
            System.out.println("Invalid Position to Insert Data");
            return;
        }

        Node newNode = new Node(data);

        // Handle insertion at position 0
        if (position == 0) {
            if (head == null) { // If the list is empty
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            return;
        }

        // Traverse to the desired position
        Node tempNode = head;
        for (int index = 0; index < position - 1; index++) {
            if (tempNode == null) { // If reached the end of the list before the desired position
                System.out.println("Position out of bounds");
                return;
            }
            tempNode = tempNode.next;
        }

        // Handle insertion at the end
        if (tempNode == tail) {
            tempNode.next = newNode;
            newNode.prev = tempNode;
            tail = newNode;
        } else {
            // Insert in the middle
            newNode.next = tempNode.next;
            newNode.prev = tempNode;
            if (tempNode.next != null) {
                tempNode.next.prev = newNode;
            }
            tempNode.next = newNode;
        }
    }

    /** Delete first Node from Doubly Linked List. */
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty..");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;

    }

    /** Delete last Node from Doubly Linked List. */
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("Doubly Linked List is Empty..");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
    }

    /** Delete Node at specific position from Doubly Linked List. */
    public void deleteFromPosition(int position) {
        if (position < 0) {
            System.out.println("Invalid Position to delete Node");
            return;
        }

        if (head == null) {
            System.out.println("Doubly Linked List is Empty..");
            return;
        }

        // Delete the first node
        if (position == 0) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node tempNode = head;
        // Traverse to the node just before the one to be deleted
        for (int index = 0; index < position - 1; index++) {
            if (tempNode == null || tempNode.next == null) {
                System.out.println("Index Out of Bounds..");
                return;
            }
            tempNode = tempNode.next;
        }

        // Now, tempNode points to the node before the one to be deleted
        Node nodeToDelete = tempNode.next;
        if (nodeToDelete == null) {
            System.out.println("Index Out Of Bounds..");
            return;
        }

        // If deleting the last node
        if (nodeToDelete.next == null) {
            tempNode.next = null;
            tail = tempNode;
        } else {
            // Deleting a node from the position.
            tempNode.next = nodeToDelete.next;
            nodeToDelete.next.prev = tempNode;
        }
    }

    /** Display Doubly Linked List from Head to Tail. */
    public void displayForward() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty..");
            return;
        }

        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.next != null) {
                System.out.print(" => ");
            }
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    /** Display Doubly Linked List from Tail to Head. */
    public void displayBackwards() {
        if (head == null) {
            System.out.println("Doubly Linked List is Empty");
            return;
        }

        Node currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            if (currentNode.prev != null) {
                System.out.print(" <= ");
            }
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

}
