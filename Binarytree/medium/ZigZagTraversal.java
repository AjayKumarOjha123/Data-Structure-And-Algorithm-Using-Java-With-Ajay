package com.Binarytree.medium;
import java.util.*;
public class ZigZagTraversal {
//    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//        List<List<Integer>> result = new ArrayList<>();
//        if (root == null) return result;
//
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.add(root);
//        boolean leftToRight = true;
//
//        while (!queue.isEmpty()) {
//            int levelSize = queue.size();
//            List<Integer> levelList = new ArrayList<>();
//
//            for (int i = 0; i < levelSize; i++) {
//                TreeNode currentNode = queue.remove();
//                if (leftToRight) {
//                    levelList.add(currentNode.val);
//                } else {
//                    levelList.add(0, currentNode.val);
//                }
//
//                if (currentNode.left != null) {
//                    queue.add(currentNode.left);
//                }
//                if (currentNode.right != null) {
//                    queue.add(currentNode.right);
//                }
//            }
//            result.add(levelList);
//            leftToRight = !leftToRight;
//        }
//        return result;
//    }
    public static void main(String[] args) {

    }
}
