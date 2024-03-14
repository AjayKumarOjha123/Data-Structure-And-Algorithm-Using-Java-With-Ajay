package com.Recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int arr[] , int n){
      if(n==1){
          return;
      }
      for(int i=0;i<n-1;i++){
          if(arr[i]>arr[i+1]){
              int temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
          }
      }
      bubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        int arr[]={5,0,2,1,5,3,6};
        bubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
