package com.study.linkedlist;

public class SinglyLinkedList {

    public static Node start;
    public static void main(String args[]){
        Integer [] data = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original List");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+"---->");
        }
        int option=8;
        switch(option){
            // Case 1: Insert the node at the beginning
            case 1:
            inserNodeAtBeginning(data);
            traverseList();
            break;

            // Case 2: Insert the node at the end
            case 2:
            inserNodeAtEnd(data);
            traverseList();
            break;

            // Case 3: search an element in the Linked list
            case 3:
                inserNodeAtEnd(data);
                traverseList();
                int searchData = 3;
                int location = seachNodeWithData(searchData);
                if(location==-1){
                    System.out.println("Node is not found in the list");
                }
                else{
                    System.out.println();
                    System.out.println("Location of the Node is:"+ location);
                }
                break;

            // Case 4: Insert After the Data
            case 4:
                inserNodeAtEnd(data);
                int dataToInsert =11;
                int inserAfter =9;
                insertNodeAfterData(dataToInsert, inserAfter);
                traverseList();
                break;

            // Case : 5 Insert Before the Data
                case 5:
                inserNodeAtEnd(data);
                dataToInsert =11;
                int insertBefore =6;
                insertNodeBeforeData(dataToInsert, insertBefore);
                traverseList();
                break;

           //Case :6 Delete the first node
                case 6:
                inserNodeAtEnd(data);
                deleteFirstNode();
                traverseList();
                break;

            //Case :7 Delete the last node
            case 7:
                inserNodeAtEnd(data);
                deleteLastNode();
                traverseList();
                break;


            //Case :8 Delete the  node after given data
            case 8:
                inserNodeAtEnd(data);
                int dataAfterDeletion = 5;
                deleteNodeAfterData(dataAfterDeletion);
                traverseList();
                break;

        }
    }


    private static void deleteNodeAfterData(int dataAfterDeletion) {
        if(SinglyLinkedList.start==null){
            System.out.println("List is empty");
            return;
        }
        Node ptr = SinglyLinkedList.start;
        Node prePtr =ptr;
        while(ptr.next!=null){
           if(prePtr.data==dataAfterDeletion) {
               prePtr.next =ptr.next;
               break;
           }
           prePtr =ptr;
           ptr=ptr.next;
        }
    }

    private static void deleteLastNode() {
        if(SinglyLinkedList.start==null){
            System.out.println("List is empty");
            return;
        }
        Node ptr = SinglyLinkedList.start;
        Node prePtr =ptr;
        while(ptr.next!=null){
            prePtr=ptr;
            ptr=ptr.next;
        }
        prePtr.next=null;
    }

    private static void deleteFirstNode() {
        if(SinglyLinkedList.start==null){
            System.out.println("List is empty");
            return;
        }
        SinglyLinkedList.start= SinglyLinkedList.start.next;
    }

    private static void insertNodeAfterData(int dataToInsert, int inserAfter) {
        Node ptr= SinglyLinkedList.start;
        Node avail= new Node(dataToInsert);
        Node prePtr = ptr;
        while(ptr !=null){
            if(ptr.data==inserAfter){
               avail.next= ptr.next;
               ptr.next=avail;
                break;
            }
            ptr=ptr.next;
        }
    }

    private static void insertNodeBeforeData(int dataToInsert, int inserBefore) {
        Node ptr= SinglyLinkedList.start;
        Node avail= new Node(dataToInsert);
        Node prePtr = ptr;
        while(ptr !=null){
            if(ptr.data==inserBefore){
                avail.next= ptr;
                prePtr.next=avail;
                break;
            }
            prePtr = ptr;
            ptr=ptr.next;
        }
    }

    private static int seachNodeWithData(int searchData) {
        Node ptr= SinglyLinkedList.start;
        int location =0;
        while (ptr.next!=null){
            location++;
            if(ptr.data==searchData){
                break;
            }
            ptr=ptr.next;

        }
        return location;
    }

    private static void inserNodeAtEnd(Integer[] data) {
        //Create Linked List by inserting an element at the front of the list
        for(int i = 0; i< data.length; i++){
            InsertAtEnd.insertNode(data[i]);
        }
    }

    private static void inserNodeAtBeginning(Integer[] data) {
        //Create Linked List by inserting an element at the front of the list
        for(int i = 0; i< data.length; i++){
            InsertAtBegining.insertNode(data[i]);
        }

    }

    private static void traverseList() {
        // Traverse the linked list
        System.out.println();
        TraverseLinkedList.traverse(start);
    }
}
