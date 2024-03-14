package com.Linkedlist.hard;

public class Rotate_LL {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        if (k % length == 0) {
            return head;
        }
        k = k % length;
        tail.next = head;
        ListNode temp = head;
        int kth = length - k;
        int count = 1;

        while (count < kth) {
            count++;
            temp = temp.next;
        }
        ListNode newhead = temp.next;
        temp.next = null;
        return newhead;
    }
    public static void print(ListNode head){
        ListNode temp=head;
        while(temp!=null){

            System.out.print(temp.val+"-->");
            temp=temp.next;
            if(temp==null){
                System.out.print("NULL");
            }
        }
    }

    public static void main(String[] args) {
        Rotate_LL ll = new Rotate_LL();
        ListNode head = new ListNode(0);
        ListNode a = new ListNode(1);
        ListNode b= new ListNode(2);
        head.next=a;
        a.next=b;
        b.next=null;
        print(head);
       ListNode newhead= rotateRight(head,4);
        System.out.println();
       print(newhead);
    }
}
