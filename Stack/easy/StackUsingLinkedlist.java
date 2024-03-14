package com.Stack.easy;

public class StackUsingLinkedlist {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }

    public static int size=0;
    public static int top;
    public static Node head;

    public static boolean isEmpty(){
        return size==0;
    }

    //Push Method
    public static int push(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
           head=newNode;
            return head.data;
        }
        newNode.next=head;
        head=newNode;
        return head.data;
    }

    // Pop Method

    public static int pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return -1;
        }
        int res=head.data;
        head=head.next;
        size--;
        return res;
    }

    // Peek Method

    public static int peek(){
        if(isEmpty()){
            System.out.println("Empty Stack ");
            return -1;
        }
        int res=head.data;
        return res;
    }

    // Print Method

    public static void print(Node head){
        Node temp=head;
        while(!isEmpty()){
            System.out.print(peek()+" ");
            pop();
        }
    }

    //Size Methods

    public static int size(){
        int res=size;
        return res;
    }

    public static void main(String[] args) {
        push(120);
        push(203);
        push(304);
        push(23);
        //print(head);
        System.out.println(size());

    }
}
