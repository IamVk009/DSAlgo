package main.linkedList.singly;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
    /*
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(30);
        linkedList.insertAtBeginning(40);
    */
        linkedList.insertAtEnd(100);
        linkedList.insertAtEnd(200);
        linkedList.insertAtEnd(300);
        linkedList.insertAtEnd(400);
        linkedList.insertAtEnd(500);
    /*
        linkedList.insertAtPosition(98, 0);
        linkedList.insertAtPosition(300, 1);
        linkedList.insertAtPosition(900, 2);
        linkedList.insertAtPosition(80, 5);
    */
        linkedList.printLinkedList(linkedList.head);
    /*
        System.out.println();
        linkedList.deleteFromPosition(3);
        linkedList.printLinkedList(linkedList.head);
        System.out.println();
        linkedList.deleteFromStart();
        linkedList.printLinkedList(linkedList.head);
        System.out.println();
        linkedList.deleteFromEnd();
        linkedList.printLinkedList(linkedList.head);
        System.out.println();
        System.out.println(linkedList.search(300));
    */
    }
}
