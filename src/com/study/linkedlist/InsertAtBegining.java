package com.study.linkedlist;

public class InsertAtBegining {

    public static void insertNode(Integer element) {
        Node avail= new Node(element);
        avail.next= SinglyLinkedList.start;
        SinglyLinkedList.start =avail;
    }
}
