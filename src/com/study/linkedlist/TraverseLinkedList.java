package com.study.linkedlist;

public class TraverseLinkedList {
    public static void traverse(Node start) {
        if(start==null){
            System.out.println("There is no record in the linked list");
            return;
        }
        Node ptr = start;
        while(ptr!=null){
            System.out.print(ptr.data);
            System.out.print("---->");
            ptr=ptr.next;
        }
    }
}
