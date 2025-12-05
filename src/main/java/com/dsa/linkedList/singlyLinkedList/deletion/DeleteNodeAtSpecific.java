package com.dsa.linkedList.singlyLinkedList.deletion;

import com.dsa.linkedList.singlyLinkedList.Node;
import com.dsa.linkedList.singlyLinkedList.SinglyLinkedList;

public class DeleteNodeAtSpecific {
    static Node deleteAtSpecific(Node head, int pos) {
        Node curr = head;
        
        for(int i = 1; i < pos-1 && curr != null; i++) {
            curr = curr.next;
        }

        if(curr == null || curr.next == null) return head;
        curr.next = curr.next.next;
        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        head = deleteAtSpecific(head, 3);
        SinglyLinkedList.printLinkedList(head);
    }
}
