package com.Array.Hard;

public class MaximumProductSubArray {

    //Brute Force Apporoach
    public static int maximumProductSubarray(int arr[],int n){
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int product=1;
                for(int k=i;k<=j;k++){
                    product*=arr[k];
                }
                maximum=Math.max(maximum,product);
            }
        }
        return maximum;
    }

    //Better Apporoach
    public static long maximumProductsubarray(int arr[],int n){
        long maximum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            long product=1;
            for(int j=i;j<n;j++){
                product*=arr[j];
                maximum=Math.max(maximum,product);
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
      int  N = 5;
      int  Arr[] = {6, -3, -10, 0, 2};
       // System.out.println(maximumProductSubarray(Arr,N));
        System.out.println( maximumProductsubarray(Arr,N));
    }
}
