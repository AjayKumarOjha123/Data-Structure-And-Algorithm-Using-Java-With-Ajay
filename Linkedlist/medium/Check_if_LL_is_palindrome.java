package com.Linkedlist.medium;

public class Check_if_LL_is_palindrome {
    /*
   public static boolean isPalindrome(Node head) {

       if(head==null && head.next==null){
           return true;
       }
       Node middle=findMiddle(head);
       Node curr=middle;
       Node prev=null;
       while(curr!=null){
           Node next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
       }
       Node left=head;
       Node right=prev;
       while(right!=null){
           if(left.data!=right.data){
               return false;
           }
           left=left.next;
           right=right.next;
       }
       return true;
   }
   public static Node findMiddle(Node head) {
       Node slow=head;
       Node fast=head;
       while(fast!=null && fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       return slow;
   }
       */
    public static void main(String[] args) {

    }
}
