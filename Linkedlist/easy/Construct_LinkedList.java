package com.Linkedlist.easy;

public class Construct_LinkedList {

    //Node Class
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //Construct LinkedList Function
    public Node constructLL(int[] arr) {

        Node head = null;
        Node tail = null;

        for (int i = 0; i < arr.length; i++) {
            int data = arr[i];
            Node newNode = new Node(data);

            if (head == null && tail == null) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        return head;
    }

    //Print Function
    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
       int  Arr[] = {4, 2, 5, 1};
        Construct_LinkedList cons=new Construct_LinkedList();
        Node head= cons.constructLL(Arr);
        print(head);

    }
}
