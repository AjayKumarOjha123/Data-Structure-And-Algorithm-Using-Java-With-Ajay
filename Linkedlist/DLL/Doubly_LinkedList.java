package com.Linkedlist.DLL;

public class Doubly_LinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }

    }

    public Node constructDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node tail=head;
        for(int i=1;i<arr.length;i++){
            Node newNode =new Node(arr[i]);
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        return head;
    }


    //Print DubliLinkedList Function
    public static void printDLL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void printDLL_Reverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
     int    N = 4;int Arr[] = {4, 2, 5, 1};
     Doubly_LinkedList dll=new Doubly_LinkedList();
     Node head= dll.constructDLL(Arr);
     printDLL(head);
    }
}
