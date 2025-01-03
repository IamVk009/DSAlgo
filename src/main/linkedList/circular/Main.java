package main.linkedList.circular;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList.insertAtBeginning(10);
        circularLinkedList.insertAtBeginning(20);
        circularLinkedList.insertAtBeginning(30);
        circularLinkedList.insertAtBeginning(40);
        circularLinkedList.insertAtBeginning(50);
        circularLinkedList.displayForward();
        circularLinkedList.insertAtPosition(0, 900);
        circularLinkedList.displayForward();
        System.out.println(circularLinkedList.search(700));

    /*
        circularLinkedList.insertAtPosition(5, 700);
        circularLinkedList.displayForward();
        circularLinkedList.insertAtPosition(4, 500);
        circularLinkedList.displayForward();
        circularLinkedList.insertAtPosition(9, 1000);
        circularLinkedList.displayForward();
        System.out.println(circularLinkedList.search(900));
        circularLinkedList.insertAtBeginning(70);
        circularLinkedList.insertAtBeginning(80);
        circularLinkedList.displayForward();
        circularLinkedList.deleteFromPosition(0);
        circularLinkedList.displayForward();
        circularLinkedList.deleteFromPosition(5);
        circularLinkedList.displayForward();
        circularLinkedList.deleteFromPosition(5);
        circularLinkedList.displayForward();
        circularLinkedList.insertAtBeginning(900);
        circularLinkedList.displayForward();

        circularLinkedList.displayBackwards();
        circularLinkedList.displayForward();

        circularLinkedList.deleteFromEnd();
        circularLinkedList.displayForward();

        circularLinkedList.deleteFromStart();
        circularLinkedList.displayForward();
    */
    }
}
