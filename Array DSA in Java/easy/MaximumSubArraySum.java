package com.Array.easy;

public class MaximumSubArraySum {

    public static int maximumSubarraySum(int arr[]){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            if(currSum<0){
                currSum=0;
            }
            max=Math.max(currSum,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,-3,4,-5,6};
        System.out.println(maximumSubarraySum(arr));
    }
}
