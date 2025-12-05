package com.dsa.linkedList.singlyLinkedList.insertion;

import com.dsa.linkedList.singlyLinkedList.Node;
import com.dsa.linkedList.singlyLinkedList.SinglyLinkedList;

public class InsertNodeAtEnd {
    static Node insertAtEnd(Node head, int x) {
        Node newNode = new Node(x);

        if(head == null) return newNode;

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int x = 6;
        head = insertAtEnd(head, x);

        SinglyLinkedList.printLinkedList(head);


    }
}
