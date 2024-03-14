package com.SlidingWindow_And_TwoPointer.medium;

import java.util.HashMap;

public class Longest_Substring_Without_Repeat_Character {
    public static int longest(String str){
        HashMap<Character,Integer>map=new HashMap<>();
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while(right<str.length()){
            char ch=str.charAt(right);
            if(map.containsKey(ch)){
                left=Math.max(map.get(ch)+1,left);
            }
            map.put(str.charAt(right), right);
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(longest("abcabcbb"));
    }
}
