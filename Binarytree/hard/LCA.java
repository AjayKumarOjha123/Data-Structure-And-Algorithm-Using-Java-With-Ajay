package com.Binarytree.hard;

public class LCA {
//    public static boolean getPath(TreeNode root,TreeNode p,List<TreeNode>list){
//        if(root==null){
//            return false;
//        }
//
//        list.add(root);
//
//        if(root==p){
//            return true;
//        }
//
//        boolean leftFound= getPath(root.left,p,list);
//        boolean  rightFound = getPath(root.right,p,list);
//
//        if(leftFound || rightFound){
//            return true;
//        }
//        list.remove(list.size()-1);
//        return false;
//    }
//
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        ArrayList<TreeNode>path1=new ArrayList<>();
//        ArrayList<TreeNode>path2=new ArrayList<>();
//
//        getPath( root, p,path1);
//        getPath( root, q,path2);
//
//        int i=0;
//        for(;i<path1.size() && i<path2.size();i++){
//            if(path1.get(i)!=path2.get(i)){
//                break;
//            }
//        }
//        return path1.get(i-1);
//    }
public static void main(String[] args) {

}
}
