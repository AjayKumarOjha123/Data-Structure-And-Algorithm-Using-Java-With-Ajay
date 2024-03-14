package com.BinarySearch.BinarySearch_On_Answer;

public class Split_Array_Largest_Sum {

    //Brute Force Apporoach
    public static int split_Array_Largest_Sum(int nums[],int k){
    int n=nums.length;
    int sum=0;
    int max=Integer.MIN_VALUE;
    if(n==k)return max;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        max=Math.max(max,nums[i]);
    }
        for(int i=max;i<=sum;i++){
        if(split(nums,i)==k){
            return i;
        }
    }
        return max;
}
    public static int split(int arr[],int max) {
        int load = 0;
        int splitCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (load + arr[i] <= max) {
                load += arr[i];
            } else {
                splitCount++;
                load = arr[i];
            }
        }
        return splitCount;
    }

    //Optimal Apporoach
    public static int split_Array_Largest_Sum_Binary_Search(int arr[],int k){
        int max=0;
        int sum=0;
        for(int num : arr){
            sum+=num;
            max=Math.max(max,num);
        }
        if(arr.length==k){
            return max;
        }
        int ans=0;
        int si=max;
        int ei=sum;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(isPossible(arr,mid,k)){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int mid,int k){
        int subArray=1;
        int sum=0;
        for(int num : arr){
            sum+=num;
            if(sum>mid){
                subArray++;
                sum=num;
            }
        }
        return subArray<=k;
    }
    public static void main(String[] args) {
       int [] nums = {10,5,13,4,8,4,5,11,14,9,16,10,20,8};int  k = 8;
        System.out.println(split_Array_Largest_Sum_Binary_Search(nums,k));
        System.out.println(split_Array_Largest_Sum(nums,k));
    }
}
