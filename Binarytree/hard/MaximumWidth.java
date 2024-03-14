package com.Binarytree.hard;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MaximumWidth {
    static int max=0;
    static class TreeNode {
        int val;
        TreeNode left,right;

       public TreeNode(int val){
           this.val=val;
           left=null;
           right=null;
       }
    }

    static class Pair{
        TreeNode node;
        int idx;

        public Pair(TreeNode node,int idx){
            this.node=node;
            this.idx=idx;
        }
    }

    //Preorder For Printing
    public static void preOrder(TreeNode root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        help(root,0);
        return max;
    }

    private static void help(TreeNode root, int i) {
        LinkedList<Pair>q=new LinkedList<>();
        q.add(new Pair(root,i));
        while(!q.isEmpty()){
            int size = q.size();
            int start = q.getFirst().idx;
            int end = q.getLast().idx;
            max = Math.max(max, end - start + 1);
            for (int j = 0; j < size; j++) {
                Pair curr=q.remove();
                i=curr.idx;
                TreeNode node=curr.node;
                if(node.left!=null){
                    q.add(new Pair(node.left,(2*i)+1));
                }
                if(node.right!=null){
                    q.add(new Pair(node.right,(2*i)+2));
                }
            }
        }
    }


    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        TreeNode left=new TreeNode(2);
        TreeNode right=new TreeNode(3);
        root.left=left;
        root.right=right;
        System.out.println(widthOfBinaryTree(root));
    }
}
