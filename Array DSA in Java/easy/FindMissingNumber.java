package com.Array.easy;

public class FindMissingNumber {

    public static int findMissingNumber(int arr[],int n){

        //Brute Force Apporoach

        int total=0;
        int totalSum=0; 
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        for(int i=1;i<=n;i++){
            totalSum+=i;
        }
        int res=totalSum-total;
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,3,4,5};
        System.out.println("Missing = "+ findMissingNumber(arr,5));
    }
}
