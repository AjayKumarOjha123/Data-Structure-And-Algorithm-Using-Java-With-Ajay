package com.Array.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int arr[]){
        int i=arr.length-2;
        int j=0;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i>=0){
            j=arr.length-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }
        reverse(arr,i+1,arr.length-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
            swap(arr,i,j);
            i++;j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 6, 5, 4};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
