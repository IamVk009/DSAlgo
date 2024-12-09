package main.linkedList;

public class LinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(190);
        System.out.println(node1.data);
        System.out.println(node1.next);

        Node node2 = new Node(200);
        node1.next = node2;
        System.out.println(node2.data);
        System.out.println(node2.next);
        System.out.println("Node 2 Data = " + node1.next.data);

        Node node3 = new Node(1000);
        node2.next = node3;
        System.out.println("Node 3 Data = " + node1.next.next.data);
    }
}
