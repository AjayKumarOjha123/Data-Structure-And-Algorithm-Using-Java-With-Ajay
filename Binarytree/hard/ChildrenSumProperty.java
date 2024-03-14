package com.Binarytree.hard;

public class ChildrenSumProperty {
    static class TreeNode {
        int val;
        MaximumWidth.TreeNode left;
        MaximumWidth.TreeNode right;

        public TreeNode(int val){
            this.val=val;
            left=null;
            right=null;
        }
    }
    //Preorder For Printing
    public static void preOrder(MaximumWidth.TreeNode root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //Children Sum Property

    public static int  help(MaximumWidth.TreeNode root){
        if(root==null)
            return 0;
        int left=help(root.left);
        int right=help(root.right);
        root.val=left+right+root.val;
        return root.val;
    }

    public static void main(String[] args) {
        MaximumWidth.TreeNode root= new MaximumWidth.TreeNode(1);
        MaximumWidth.TreeNode left=new MaximumWidth.TreeNode(2);
        MaximumWidth.TreeNode right=new MaximumWidth.TreeNode(3);
        root.left=left;
        root.right=right;
        preOrder(root);
        help(root);
        System.out.println();
        preOrder(root);
    }
}
