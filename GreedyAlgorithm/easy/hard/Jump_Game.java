package com.GreedyAlgorithm.easy.hard;

public class Jump_Game {
    public static boolean jump_search(int []nums, int n){
        // Write your code here.
        return help(nums,0,n);

    }
    public static boolean help(int[] nums,int idx,int n) {
        if(idx==n-1)return true;

        for(int i=1;i<=nums[idx];i++){
            if(help(nums,idx+i,n)==true)return true;
        }

        return false;
    }

    public static void main(String[] args) {
       int [] nums = {2,3,1,1,4};
        System.out.println(jump_search(nums,nums.length));
    }
}
