public class MergeSort_LL {
   static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  Node findMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public  Node  mergeSort_LL(Node head){
        if(head==null || head.next==null){
            return head;
        }
       //Find 1st Half Mid
        Node mid=findMid(head);
        Node left=head;
        Node right=mid.next;
        mid.next=null;
        mergeSort_LL(left);
        mergeSort_LL(right);
        merge(left,right);
        return head;
    }

    private Node merge(Node left, Node right) {
        Node newNode=new Node(-1);
        Node  temp=newNode;
        Node lefthead=left;
        Node righthead=right;
        while(lefthead!=null && righthead!=null){
            if(lefthead.data<=righthead.data){
                temp.next=lefthead;
                temp=temp.next;
                lefthead=lefthead.next;
            }
            else{
                temp.next=righthead;
                temp=temp.next;
                righthead=righthead.next;
            }
        }
        while(lefthead!=null){
            temp.next=lefthead;
            temp=temp.next;
            lefthead=lefthead.next;
        }
        while(righthead!=null){
            temp.next=righthead;
            temp=temp.next;
            righthead=righthead.next;
        }
        return newNode.next;
    }
 public  static void print(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        MergeSort_LL ll=new MergeSort_LL();
        Node head=new Node(1);
        Node a=new Node(5);
        Node b=new Node(4);
        Node c=new Node(9);
        Node d=new Node(1);
        Node e=new Node(1);
        head.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        ll.mergeSort_LL(head);
        print(head);
    }
}