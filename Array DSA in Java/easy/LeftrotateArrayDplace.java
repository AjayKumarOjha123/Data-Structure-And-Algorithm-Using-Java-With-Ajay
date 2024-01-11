package com.Array.easy;

import java.util.Arrays;

public class LeftrotateArrayDplace {

    public static void leftrotateArrayDplace(int arr[],int d){
        int i=0;
        int temp[]=new int [d+1];
        for(int k=0;k<d;k++){
            temp[k]=arr[k];
        }
        for(int j=d;j<arr.length;j++){
            arr[i]=arr[d];
            i++;
        }
    }
    public static void leftrotateArrayDplace2(int arr[],int d){
        int count=-1;
        for(int i=arr.length-1;i>0;i--){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
            count++;
            if(count==d) break;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftrotateArrayDplace2(arr,3);
        System.out.println( Arrays.toString(arr));
    }
}
