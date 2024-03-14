package com.Binarytree.medium;
import java.util.ArrayList;
import java.util.List;

public class BoundaryLevelTraversal {

   static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Solution {

        public static void left(TreeNode root, List<Integer> ans) {
            if (root == null) return;
            if (root.left != null || root.right != null) {
                ans.add(root.data);
                if (root.left != null) left(root.left, ans);
                else left(root.right, ans);
            }
        }

        public static void leaf(TreeNode root, List<Integer> ans) {
            if (root == null) return;
            leaf(root.left, ans);
            if (root.left == null && root.right == null) ans.add(root.data);
            leaf(root.right, ans);
        }

        public static void right(TreeNode root, List<Integer> ans) {
            if (root == null) return;
            if (root.right != null || root.left != null) {
                if (root.right != null) right(root.right, ans);
                else right(root.left, ans);
                ans.add(root.data);
            }
        }

        public static List<Integer> traverseBoundary(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            if (root == null) return ans;
            ans.add(root.data);
            left(root.left, ans);
            leaf(root, ans);
            right(root.right, ans);
            return ans;
        }

        public static void main(String[] args) {
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.left = new TreeNode(4);
            root.left.right = new TreeNode(5);
            root.left.right.left = new TreeNode(7);
            root.left.right.right = new TreeNode(8);
            root.right.left = new TreeNode(6);
            root.right.left.left = new TreeNode(9);
            root.right.left.right = new TreeNode(10);

            List<Integer> boundary = traverseBoundary(root);
            System.out.println("Boundary Traversal: " + boundary);
        }
    }

}
