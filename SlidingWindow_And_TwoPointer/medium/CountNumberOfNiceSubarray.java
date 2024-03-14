package com.SlidingWindow_And_TwoPointer.medium;

public class CountNumberOfNiceSubarray {
    public static int numberOfSubarrays(int[] arr, int K) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int odd=0;
                for(int k=i;k<=j;k++){
                    if(arr[k]%2!=0){
                        odd++;
                    }
                }
                if(odd==K){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int [] nums = {1,1,2,1,1};
       int k = 3;
        System.out.println( numberOfSubarrays(nums,k));
    }
}
