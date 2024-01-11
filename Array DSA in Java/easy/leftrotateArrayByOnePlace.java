package com.Array.easy;

import java.util.Arrays;

public class leftrotateArrayByOnePlace {
    public static void leftrotateArraybyOnePlace(int arr[]){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String[] args) {
        int arr[]={2,4,21,32,43,54};
        System.out.println(Arrays.toString(arr));
        leftrotateArraybyOnePlace(arr);
        System.out.println(Arrays.toString(arr));
    }
}
