package com.dsa.linkedList;


public class InsertNodeAtFront {
    static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }


    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        int x = 1;
        head = insertAtFront(head, x);

        SinglyLinkedList.printLinkedList(head);

    }
}
