package com.Binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

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

    // Build Tree Function
   static int idx=-1;
    public static Node buildTree(int arr[]){
        idx++;
        Node root=new Node(arr[idx]);
        if(root.data==-1){
            return null;
        }
        root.left=buildTree(arr);
        root.right=buildTree(arr);
        return root;
    }

    // Preorder Traversal On Binary Tree

    public static void preorder(Node root){
        if(root==null){
           // System.out.print("-1 ");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    // inorder Traversal On Binary Tree

    public static void inorder(Node root){

        if(root==null){
            //System.out.print("-1 ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //Postorder Traversal On BinaryTree

    public static void postorder(Node root){

        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //Level Order Traversal On Binary Tree

    public static void levelorder(Node root, int level){

        if(root==null){
            return;
        }

        Queue<Node>q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count = 1;
        int sum = 0;
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                count++;
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(count==level) sum =sum + currNode.data;
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
        System.out.println("LOT : "+sum);
    }

    // Count Nodes Function

    static int count=0;
    public static int countNodes(Node root){

        if(root==null){
            return 0;
        }
        int leftCount=countNodes(root.left);
        int rightCount=countNodes(root.right);
        count=leftCount+rightCount+1;
        return count;
    }


    //Sum Of Nodes

    static int sum=0;
    public static int sumOfNodes(Node root){

        if(root==null){
            return 0;
        }
        int lss=sumOfNodes(root.left);
        int rss=sumOfNodes(root.right);
        sum=lss+rss+root.data;
        return sum;
    }

    //Hieght Of Tree

    public static int hightOfTree(Node root){

        if(root==null){
            return 0;
        }

        int lh=hightOfTree(root.left);
        int rh=hightOfTree(root.right);
        int res=Math.max(lh,rh);
        return res+1;
    }

    //Diameter Of Tree

    public static int diameterOfTree(Node root){

        if(root==null){
            return 0;
        }

        int ld=diameterOfTree(root.left);
        int rd=diameterOfTree(root.right);
        int height=hightOfTree(root.left)+hightOfTree(root.right)+1;
        int diameter=Math.max(ld,Math.max(rd,height));
        return diameter;
    }

    //Sum Of Node at kth Level

     public static void levelSum(Node root, int level, int []sum){
        if(root==null) return;
        if(level==1) sum[0] += root.data;
        else if(level>1){
            levelSum(root.left,level-1, sum);
            levelSum(root.right, level-1, sum);
        }
     }
    public static int sumOfNodeKthLevel(Node root,int kth){
      int sum [] = new int[1];
      levelSum(root, kth, sum);
      return sum[0];
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,-1,-1,6,-1,-1,3,-1,-1};
        Node root = buildTree(arr);
       // System.out.println(root.data);
//        preorder(root);
//         System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
//        System.out.println();
        levelorder(root,1);
        System.out.println( countNodes(root));
        System.out.println(sumOfNodes(root));
        System.out.println(hightOfTree(root));
        System.out.println(diameterOfTree(root));
        System.out.println(sumOfNodeKthLevel(root,3));
    }
}
