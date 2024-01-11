package com.Array.medium;

import java.util.Arrays;

public class TwoSum {

    //Brute Force Apporoach
    public static String twoSum(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return "YES";
                }
            }
        }
        return "NO";
    }

    //Better Apporoach

    public static boolean toSum(int arr[],int k){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==k){
                return true;
            }
            else if(sum<k){
                i++;
            }
            else if(sum>k){
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      int arr[] = {1, -2, 1, 0, 5};
     // System.out.println( twoSum(arr,0));
        System.out.println(toSum(arr,3));
    }
}
