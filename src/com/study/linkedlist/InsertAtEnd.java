package com.study.linkedlist;

public class InsertAtEnd {
    public static void insertNode(Integer element) {
        Node avail= new Node(element);
        avail.next= null;
        // If linked list is empty, need special handling
        if(SinglyLinkedList.start==null){
            SinglyLinkedList.start =avail;
            return;
        }
        Node ptr = SinglyLinkedList.start;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=avail;
    }
}
