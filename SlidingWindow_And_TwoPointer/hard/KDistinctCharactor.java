package com.SlidingWindow_And_TwoPointer.hard;

import java.util.HashMap;

public class KDistinctCharactor {
    public static int longest(String str,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while(right<str.length()){
            char ch=str.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
            while(map.size()>k){
                int val=map.get(str.charAt(left));
                if(val-1==0){
                    map.remove(str.charAt(left));
                }
                else{
                    map.put(str.charAt(left),val-1);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        String str="abcddefg";
        int k=3;
        System.out.println(longest(str,k));
    }
}
