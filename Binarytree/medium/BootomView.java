package com.Binarytree.medium;

public class BootomView {
//    static class Info{
//        Node node;
//        int hd;
//
//        public Info(Node node ,int hd){
//            this.node=node;
//            this.hd=hd;
//        }
//    }
//    //Function to return a list containing the bottom view of the given tree.
//    public ArrayList <Integer> bottomView(Node root)
//    {
//        // Code here
//        ArrayList<Integer>ans=new ArrayList<>();
//
//        Queue<Info>q=new LinkedList<>();
//        HashMap<Integer,Node>map=new HashMap<>();
//
//        q.add(new Info(root,0));
//        q.add(null);
//
//        int min=0,max=0;
//
//        while(!q.isEmpty()){
//            Info curr=q.remove();
//            if(curr==null){
//                if(q.isEmpty()){
//                    break;
//                }
//                else{
//                    q.add(null);
//                }
//            }
//
//            else{
//                map.put(curr.hd,curr.node);
//
//                if(curr.node.left!=null){
//                    q.add(new Info(curr.node.left,curr.hd-1));
//                    min=Math.min(min,curr.hd-1);
//                }
//
//                if(curr.node.right!=null){
//                    q.add(new Info(curr.node.right,curr.hd+1));
//                    max=Math.max(max,curr.hd+1);
//                }
//            }
//        }
//
//        for(int i=min;i<=max;i++){
//            ans.add(map.get(i).data);
//        }
//
//        return ans;
//    }

    public static void main(String[] args) {

    }
}
