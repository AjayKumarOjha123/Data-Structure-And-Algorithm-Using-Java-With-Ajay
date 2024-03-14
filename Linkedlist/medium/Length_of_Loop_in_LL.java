package com.Linkedlist.medium;

public class Length_of_Loop_in_LL {
    /*
    public static int lengthOfLoop(Node head) {
         if(head==null || head.next==null){
             return 0;
         }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return length(slow,fast);
            }
        }
        return 0;
    }

    public static int length(Node slow,Node fast){
        int count=1;
        fast=fast.next;
        while(slow!=fast){
            count++;
            fast=fast.next;
        }
        return count;
    }

     */
    public static void main(String[] args) {

    }
}
