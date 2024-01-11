package com.Array.easy;

import java.util.Arrays;

public class SecondLargest {

    //Brute Force Apporoach
    public static int secondLargest(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    public static void main(String[] args) {
        int arr[]={4,59,39,19,40};
        System.out.println(secondLargest(arr));
    }
}
