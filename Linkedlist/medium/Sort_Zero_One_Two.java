package com.Linkedlist.medium;

public class Sort_Zero_One_Two {
    /*
    public static Node sortList(Node head) {
        Node zero = new Node(-1);
        Node one = new Node(-1);
        Node two = new Node(-1);

        Node zeroPointer = zero;
        Node onePointer = one;
        Node twoPointer = two;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                zeroPointer.next = temp;
                zeroPointer = zeroPointer.next;
            } else if (temp.data == 1) {
                onePointer.next = temp;
                onePointer = onePointer.next;
            } else {
                twoPointer.next = temp;
                twoPointer = twoPointer.next;
            }
            temp = temp.next;
        }
        if(one!=null){
            zeroPointer.next=one.next;
        }
        else{
            zeroPointer.next=two.next;
        }
        onePointer.next = two.next;
        twoPointer.next = null;

        // Return the sorted list
        return zero.next;
    }

     */
    public static void main(String[] args) {

    }
}
