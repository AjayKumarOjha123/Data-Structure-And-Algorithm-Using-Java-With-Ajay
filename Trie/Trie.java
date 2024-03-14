package com.Trie;

public class Trie {
   static Node root=new Node();
   public static void insert(String str){
       Node curr=root;
       for(int i=0;i<str.length();i++){
           int idx=str.charAt(i)-'a';
           if(curr.children[idx]==null){
               curr.children[idx]=new Node();
           }
           if(i==str.length()-1){
               curr.children[idx].eow=true;
           }
           curr=curr.children[idx];
       }
   }

   //Search in Trie Data Structure
    public static boolean search(String key){
       Node curr=root;
       for(int i=0;i<key.length();i++){
           int idx=key.charAt(i)-'a';
           Node node =curr.children[idx];
           if(node==null){
               return false;
           }
           if(i==key.length()-1 && !node.eow){
               return false;
           }
           curr=node;
       }
       return true;
    }

    //Word Break Problem
    public static boolean wordBreak(String str){
       if(str.length()==0){
           return true;
       }
       for(int i=1;i<=str.length();i++){
           String firstPart=str.substring(0,i);
           String secondPart=str.substring(i);
           if(search(firstPart) && wordBreak(secondPart)){
               return true;
           }
       }
       return false;
    }

    //Start With Problem For Prefix
    public static boolean startWith(String str){
       Node curr=root;
       for(int i=0;i<str.length();i++){
           int idx=str.charAt(i)-'a';
           if(curr.children[idx]==null){
               return false;
           }
           curr=curr.children[idx];
       }
       return true;
    }
    public static void main(String[] args) {
        String word[]={"i","like","sam","samsung","mobile"};
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
       // System.out.println(search("sam"));
       // System.out.println(wordBreak("ilikesamsung"));
        System.out.println(startWith("sam"));
    }
}


