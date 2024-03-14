package com.Binarytree.easy;

import com.Binarytree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
//    public static void levelorder(BinaryTree.Node root, int level){
//
//        if(root==null){
//            return;
//        }
//
//        Queue<BinaryTree.Node> q=new LinkedList<>();
//        q.add(root);
//        q.add(null);
//        int count = 1;
//        int sum = 0;
//        while(!q.isEmpty()){
//            BinaryTree.Node currNode=q.remove();
//            if(currNode==null){
//                count++;
//                System.out.println();
//                if(q.isEmpty()){
//                    break;
//                }
//                else{
//                    q.add(null);
//                }
//            }
//            else{
//                if(count==level) sum =sum + currNode.data;
//                System.out.print(currNode.data+" ");
//                if(currNode.left!=null){
//                    q.add(currNode.left);
//                }
//                if(currNode.right!=null){
//                    q.add(currNode.right);
//                }
//            }
//        }
//        System.out.println("LOT : "+sum);
//    }

    public static void main(String[] args) {

    }
}
