package com.Linkedlist;

class LinkedList{
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static int size=0;

   //Add First in Linkedlist

    public static void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Add Middle in Linkedlist

    public static void addMiddle(int data,int idx){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        if(head.next==null){
            head.next=newNode;
            return;
        }
        int i=1;
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //Add Last in Linkedlist

    public static void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    // Print Linkedlist

    public static void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    // Remove First in Linkedlist

    public static void removeFirst(){
        if(head==null){
            System.out.println("Linkedlist is Empty");
            return;
        }
        size--;
        head=head.next;

    }

    // Remove Middle in Linkedlist

    public static void removeMiddle(int idx){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }
        if(head.next==null){
            head=null;
            size--;
            return;
        }
        if(head.next.next==null){
            head.next=null;
            size--;
            return;
        }
        Node temp=head;
        int i=1;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        size--;
        temp.next=temp.next.next;
    }

    //Remove Last in Linkedlist

    public static void removeLast(){
        if(head==null){
            System.out.println("LL is Empty");
            return;
        }

        if(head.next==null){
            head=null;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        size--;
        temp.next=null;

    }

// iterative Search Code

    public static boolean search(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }

    // Reverse Linkedlist

    public static void reverseLinkedlist(){
        Node temp=head;
      Node prev=null;
      Node curr=temp;
      Node next;

      while(curr!=null){
          next=curr.next;
          curr.next=prev;
          prev=curr;
          curr=next;
      }
      head=prev;
    }

    //Remove Nth Node From End

    public static void removeNthFromEnd(int idx){
        // Step 1 --> Calculate Size Of LL
        Node temp=head;
        int sz=0;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }

        // Step 2 --> Calculate Privious index.
        if(sz==idx){
            head=head.next;
            return;
        }
        int i=1;
        Node prev=head;
        while(i<sz-idx){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }

    public static void main(String[] args) {
       addLast(2);
       addLast(4);
       addLast(34);
       removeNthFromEnd(1);
       removeNthFromEnd(1);
        print();


    }
}