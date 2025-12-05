package com.dsa.linkedList.singlyLinkedList.deletion;

import com.dsa.linkedList.singlyLinkedList.Node;
import com.dsa.linkedList.singlyLinkedList.SinglyLinkedList;

public class DeleteNodeAtEnd {
    static Node deleteAtEnd(Node head) {
        if(head == null) return null;
        if(head.next == null) return null;

        Node secondLast = head;

        while(secondLast.next.next != null) {
            secondLast = secondLast.next;
        }

        secondLast.next = null;

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteAtEnd(head);
        SinglyLinkedList.printLinkedList(head);


    }
}
