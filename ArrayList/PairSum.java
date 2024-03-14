package com.ArrayList;

import java.util.Arrays;

public class PairSum {

    //Pair Sum Function

    public static boolean pairSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    // PairSum O(n) Time Complexity

    public static boolean pairSum2(int arr[],int target){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            if(arr[start]+arr[end]==target){
                return true;
            }
           else if(arr[start]+arr[end]<target){
               start++;
            }
           else{
               end--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={10,110,90,50,60};
        System.out.println( pairSum(arr,120));
        System.out.println(pairSum2(arr,120));
    }
}
