package com.BinarySearchTree.easy;

import com.BinarySearchTree.BuildBST;

import static com.BinarySearchTree.easy.Node.inorder;
import static com.BinarySearchTree.easy.Node.insert;

public class SearchInBST {

    public static boolean search(Node root,int data){
        if(root==null)return false;
        if(root.data==data)return true;

        if(root.data>data){
            return search(root.left,data);
        }
        else{
            return search(root.right,data);
        }
    }
    public static void main(String[] args) {
        int nodes[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<nodes.length;i++){
            root=insert(root,nodes[i]);
        }
        inorder(root);
        System.out.println(search(root,6));
    }
}
