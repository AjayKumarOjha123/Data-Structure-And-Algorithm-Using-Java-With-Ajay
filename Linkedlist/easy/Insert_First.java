package com.Linkedlist.easy;

public class Insert_First {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  Node insertAtFirst(Node list, int newValue) {
        // Write your code here
        Node newNode=new Node(newValue);
        newNode.next=list;
        list=newNode;
        return list;
    }

    public static void main(String[] args) {

    }
}
