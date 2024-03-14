package com.Binarytree.easy;

public class RepresentBinaryTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }

    static int idx=-1;
    public static Node createBinaryTree(int arr[]){
        idx++;
        Node root=new Node(arr[idx]);
        if(root.data==-1)return null;
        root.left=createBinaryTree(arr);
        root.right=createBinaryTree(arr);

        return root;
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,-1,-1,6,-1,-1,3,-1,-1};
        System.out.println( createBinaryTree(arr).data);
    }
}
