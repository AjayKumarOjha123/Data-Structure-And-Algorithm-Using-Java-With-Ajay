package com.Array.medium;

import java.util.Arrays;

public class Next_Permutation {

    public static void reverse(int arr[],int i,int j){
        while(i<j){
          swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int arr[],int num1,int num2){
        int temp=arr[num1];
        arr[num1]=arr[num2];
        arr[num2]=temp;
    }

    public static void next_permutation(int arr[]){
        int n=arr.length;
        int idx=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            reverse(arr,0,n-1);
            return;
        }
        for(int i=n-1;i>idx;i--){
            if(arr[i]>arr[idx]){
                swap(arr,i,idx);
                break;
            }
        }
        reverse(arr,idx+1,n-1);
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,6,5,4};
         next_permutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
