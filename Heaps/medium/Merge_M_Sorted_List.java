package com.Heaps.medium;

import java.util.ArrayList;

public class Merge_M_Sorted_List {
    static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;

        if(l1.data < l2.data) {
            l1.next = mergeTwoList(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoList(l1, l2.next);
            return l2;
        }
    }

    public static ListNode devideList(ArrayList<ListNode> lists, int si, int ei) {
        if (si == ei) return lists.get(si); // Return the node at si position when base case is reached
        if (si > ei) return null; //  base case condition

        int mid = (si + ei) / 2;
        ListNode l1 = devideList(lists, si, mid);
        ListNode l2 = devideList(lists, mid + 1, ei);

        return mergeTwoList(l1, l2);
    }


    public static ListNode mergeKLists(ArrayList<ListNode> lists) {
        ListNode head = devideList(lists, 0, lists.size() - 1);
        return head;
    }


    public static void main(String[] args) {
        ArrayList<ListNode> arr = new ArrayList<>();
        // [[1,4,5],[1,3,4],[2,6]]
        ListNode l1 = new ListNode(1);
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(5);
        l1.next = a;
        a.next = b;

        ListNode l2 = new ListNode(1);
        ListNode a1 = new ListNode(3);
        ListNode b1 = new ListNode(4);
        l2.next = a1;
        a1.next = b1;

        ListNode l3 = new ListNode(2);
        ListNode a2 = new ListNode(6);
        l3.next = a2;

        arr.add(l1);
        arr.add(l2);
        arr.add(l3);
        System.out.println(mergeKLists(arr).data);
    }
}
