package com.Linkedlist.medium2;

public class Find_Pair_with_Sum_DLL {

    //Brute Force
    /*
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {

        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        Node temp1=head;
        while(temp1!=null){
            Node temp2=temp1.next;
            while(temp2!=null){
                if(temp1.data+temp2.data==target){
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(temp1.data);
                    temp.add(temp2.data);
                    list.add(temp);
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return list;
    }

 //////////////////Optimal Apporoach\\\\\\\\\\\\\\\\\\\\\

        Node h=head;
        Node t=findtail(head);
        while(h.data<t.data){
            if(h.data+t.data==target){
                ArrayList<Integer>temp=new ArrayList<>();
                temp.add(h.data);
                temp.add(t.data);
                list.add(temp);
                h=h.next;
                t=t.prev;
            }
            else if(h.data+t.data<target){
                h=h.next;
            }
            else{
                t=t.prev;
            }
        }
        return list;

    }
    public static Node findtail(Node head){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        return tail;
    }
     */
    public static void main(String[] args) {

    }
}
