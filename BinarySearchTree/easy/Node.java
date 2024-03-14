package com.BinarySearchTree.easy;

import com.BinarySearchTree.BuildBST;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
    public static Node insert(Node root, int data){
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

    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

}
