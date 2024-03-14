package com.Queue;

public class QueueUsingLinkedlist {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }

    }
    public static Node head=null;
    public static Node tail=null;
    public static int size=0;


    //Add Method in Queue
    public static void add(int data){
        Node newNode=new Node(data);
        size++;
        if(tail==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    // Remove Method on Queue
    public static int remove(){
        if(head==null && tail==null){
            System.out.print("Queue is Empty");
            return -1;
        }
        if(head==tail){
            int res=head.data;
            head=tail=null;
            size--;
            return res;
        }
        int res= head.data;
        head=head.next;
        size--;
        return res;
    }

    //Peek Method on Queue

    public static int peek(){
        if(head==null && tail==null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int res=head.data;
        return res;
    }
    public static void main(String[] args) {
         add(100);
         add(200);
         add(300);
         add(400);
         add(500);
        System.out.println(peek());
        remove();
        System.out.println(peek());

    }
}
