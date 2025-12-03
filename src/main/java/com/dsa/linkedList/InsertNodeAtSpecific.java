package com.dsa.linkedList;

public class InsertNodeAtSpecific {
    static Node insertAtSpecific(Node head, int index, int val) {
        Node newNode = new Node(val);

        Node temp = head;
        for(int i = 1; i < index-1 && temp != null; i++) {
            temp = temp.next;
        }

        if(temp == null) return head;

        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(50);

        int index = 4;
        int value = 40;
        head = insertAtSpecific(head, index, value);

        SinglyLinkedList.printLinkedList(head);
    }
}
