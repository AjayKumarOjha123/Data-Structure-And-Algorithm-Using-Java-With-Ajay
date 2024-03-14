package com.SlidingWindow_And_TwoPointer.medium;

public class Maximum_Consicutive_Ones_III {
    public static int longestOnes(int[] arr, int k) {
        int left=0;
        int right=0;
        int zero=0;
        int max=Integer.MIN_VALUE;
        while(right<arr.length){
            if(arr[right]==0){
                zero++;
            }
            while(zero>k){
                if(arr[left]==0){
                    zero--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
       int arr[]={1,1,1,0,0,0,1,1,1,1,0};
       int k = 2;
        System.out.println(longestOnes(arr,k));
    }
}
