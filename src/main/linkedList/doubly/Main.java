package main.linkedList.doubly;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertAtBeginning(10);
        doublyLinkedList.insertAtBeginning(20);
        doublyLinkedList.insertAtBeginning(30);
        doublyLinkedList.insertAtBeginning(40);
        doublyLinkedList.insertAtBeginning(50);
        doublyLinkedList.displayForward();
        doublyLinkedList.displayBackwards();
        System.out.println(doublyLinkedList.search(10));
    /*
        doublyLinkedList.insertAtBeginning(100);
        doublyLinkedList.displayForward();
        doublyLinkedList.insertAtEnd(1000);
        doublyLinkedList.displayForward();
        doublyLinkedList.insertAtPosition(3, 2000);
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteFromPosition(3);
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteFromStart();
        doublyLinkedList.displayForward();
        doublyLinkedList.deleteFromEnd();
        doublyLinkedList.displayForward();
    */
    }
}
