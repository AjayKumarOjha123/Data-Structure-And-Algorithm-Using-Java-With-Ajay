package com.Linkedlist.medium;

public class Add_One_Number {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
        return head;
    }

    public static Node addNode(Node head) {
        head=reverse(head);
        Node curr=head;
        while(curr!=null){
            if(curr.data==9 && curr.next==null){
                curr.data=1;
                Node temp=new Node(0);
                temp.next=head;
                head=temp;
            }
            else if(curr.data==9){
                curr.data=0;
            }
            else{
                curr.data+=1;
                break;
            }
            curr=curr.next;
        }
        head=reverse(head);
        return head;
    }

    public static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(9);
        Node a = new Node(9);
        head.next = a;
        a.next=null;
        Node head1=addNode(head);
        print(head1);
    }
}
