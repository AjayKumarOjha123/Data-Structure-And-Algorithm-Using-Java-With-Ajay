package com.Array.easy;

import java.util.HashMap;

public class LongestSubArraySumK {

    public static int longestSubarrayEqualK(int arr[],int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum += arr[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static int longestSubarraySumEqualK(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int maxlength=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
               maxlength=Math.max(maxlength,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                int length=i-map.get(rem);
                maxlength=Math.max(length,maxlength);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,1,1,4,2,3};
       // System.out.println( longestSubarrayEqualK(arr,15));
        System.out.println(longestSubarraySumEqualK(arr,3));
    }
}
