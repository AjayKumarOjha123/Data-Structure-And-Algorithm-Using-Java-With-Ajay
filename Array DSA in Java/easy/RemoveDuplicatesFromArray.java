package com.Array.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

    public static void removeDuplicates(int[] arr) {
      int i=0;
      for(int j=1;j<arr.length;j++){
//          if(arr[i]==0){
//              continue;
//          }
          if(arr[i]!=arr[j]){
              i++;
              arr[i]=arr[j];
//              arr[j]=0;
          }
//          else{
//              arr[j]=0;
//          }

      }
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));

    }
}
