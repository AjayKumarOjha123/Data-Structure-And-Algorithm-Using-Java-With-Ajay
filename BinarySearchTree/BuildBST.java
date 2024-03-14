package com.BinarySearchTree;

import java.util.ArrayList;

public class BuildBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    //BuildBST
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(root.data>data){
            root.left=insert(root.left,data);
        }else{
            root.right=insert(root.right,data);
        }
        return root;
    }

    //inorder Traversal On BST-->(Always gives accending order)

    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Delete Node in BST
    private static Node deleteNode(Node root, int data) {
        if(root.data>data){
            root.left=deleteNode(root.left,data);
        }
        else if(root.data<data){
            root.right=deleteNode(root.right,data);
        }
        else{
            //if leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //if one child
            if(root.left==null){
                return root.right;
            }

            if(root.right==null){
                return root.left;
            }

            //if both child available
           Node IS= findinorderSuccesser(root.right);
            root.data=IS.data;
            root.right=deleteNode(root.right,IS.data);
        }
        return root;
    }

    private static Node findinorderSuccesser(Node root) {
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    //Print in Range

    public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }

        //Agar k1 se bada hai root And k2 se chhota hai

        if(root.data>=k1 && root.data<=k2){
           printInRange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printInRange(root.right,k1,k2);
        }

        //agar k1 se chhota hai root
       else if(root.data<=k1){
            printInRange(root.left,k1,k2);
        }

       //agar k2 se bada hai root
        else{
            printInRange(root.right,k1,k2);
        }
    }

    //Find Minimum Element in BST
    public static int minValue(Node root) {
        // Write your code here.
       if(root==null)return -1;
        if(root.left!=null) return minValue(root.left);
        else return root.data;
    }

    //Find Maximum Element in BST
    public static int maxValue(Node root) {
        // Write your code here.
        if(root==null)return -1;
        if(root.right!=null) return maxValue(root.right);
        else return root.data;
    }
                  //^
    //Floor in BST (|floor<=element)

    public static int floor(Node root,int key) {
        // Write your code here.
        int floor=-1;
        if(root==null)return floor;
        while(root!=null){
            if(root.data==key){
                floor=root.data;
                return floor;
            }
            if(root.data>key){
                root=root.left;
            }else{
                floor=root.data;
                root=root.right;
            }
        }
        return floor;
    }

    //Ceil in BST ( | Ceil>=key)
                  //^
    public static int ceil(Node root,int key) {
        int ceil=-1;
        if(root==null)return ceil;
        while(root!=null){
            if(root.data==key){
                ceil=root.data;
                return ceil;
            }
            if(root.data<key){
                root=root.right;
            }else{
                ceil=root.data;
                root=root.left;
            }
        }
        return ceil;
    }

    //Valid BST or Not Approach 1 (Using Array)
    public static boolean validBst(Node root){
        ArrayList<Integer>list=new ArrayList<>();
        valid(root,list);
        return checkSorted(list);
    }

    private static boolean checkSorted(ArrayList<Integer> list) {
        int prev=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)<prev){
                return false;
            }
            else{
                prev=list.get(i);
            }
        }
        return true;
    }
    private static void valid(Node root, ArrayList<Integer> list) {
        if(root==null)return;
        valid(root.left,list);
        list.add(root.data);
        valid(root.right,list);
    }


    //Valid BST or Not Approach 2

    public boolean isValidBST(Node root) {
        return help(root,null,null);
    }

    public static boolean help(Node root,Node min ,Node max){
        if(root==null){
            return true;
        }

        if(min!=null && root.data<=min.data){
            return false;
        }

        if(max!=null && root.data>=max.data){
            return false;
        }

        return help(root.left,min,root) && help(root.right,root,max);
    }

    //Find Kth Smallest (Apporoach 1)Using Array

    public static int kthSmallest(Node root ,int k){
        ArrayList<Integer>list=new ArrayList<>();
        help(root,list);
        int smallest=-1;
        for(int i=0;i<=k-1;i++){
            smallest=list.get(i);
        }
        return smallest;
    }

    private static void help(Node root, ArrayList<Integer> list) {
        if(root==null)return ;
        help(root.left,list);
        list.add(root.data);
        help(root.right,list);
    }

    //Find Kth Smallest (Apporoach 2)
    static int count=0;
    static int ans=0;

    public static int kthSmall(Node root ,int k){
        helper(root,count,ans,k);
        return ans;
    }
    private static void helper(Node root, int count, int ans,int k) {
        if(root==null){
            return;
        }
        helper(root.left,count,ans,k);
        if(count==k){
            ans=root.data;
            return;
        }
        count++;
        helper(root.right,count,ans,k);
    }

    //Find Kth Largest (Approach 1)Using Array

    public static int kthLargest(Node root ,int k){
        ArrayList<Integer>list=new ArrayList<>();
        helpme(root,list);
        int largest=-1;
        for(int i=0;i<list.size()-(k-1);i++){
            largest=list.get(i);
        }
        return largest;
    }

    private static void helpme(Node root, ArrayList<Integer> list) {
        if(root==null)return ;
        helpme(root.left,list);
        list.add(root.data);
        helpme(root.right,list);
    }

    public static void main(String[] args) {
        int nodes[]={5,10,3,4,2};
        Node root=null;
        for(int i=0;i<nodes.length;i++){
           root=insert(root,nodes[i]);
        }
//        inorder(root);
//       root= deleteNode(root,6);
//        System.out.println();
     //   printInRange(root,1,7);
       // System.out.println(minValue(root));
       // System.out.println(maxValue(root));
       // System.out.println(floor(root,6));
       // System.out.println(ceil(root,6));
       // System.out.println(validBst(root));
        //System.out.println(validBSTorNot(root));
        System.out.println(kthSmallest(root,5));
        System.out.println(kthSmall(root,2));
        System.out.println(kthLargest(root,5));
    }

}
