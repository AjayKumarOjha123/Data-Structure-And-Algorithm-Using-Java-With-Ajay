package com.Array.easy;

import java.util.Arrays;

public class LargestElementArray {

    //Brute Force Apporoach
    public static int largest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Optimize Apporoach
    public static int largest2(int arr[]){
        int largest=arr[0];
       for(int i=1;i<arr.length;i++){
           if(arr[i]>largest){
               largest=arr[i];
           }
       }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]={90,200,8,4,56,67,89,23,45,90,100};
        System.out.println(largest(arr));
        System.out.println(largest2(arr));
    }
}
