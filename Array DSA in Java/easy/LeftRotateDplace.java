package com.Array.easy;

import java.util.Arrays;

public class LeftRotateDplace {

    public static void leftrotateDplace(int arr[],int d){
        if(d>arr.length){
            d=d%arr.length;
        }
        int count=0;
        while(true){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
            count++;
            if(count==d){
                break;
            }
        }
    }

    //OPTIMAL SOLUTION
    public static void leftrotateArrayDplace(int arr[],int n,int d){
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[]={25,6,20,55,69,5,50,63,61,41,87,80,2,96,77,70,12,43,
                31,8,64,41,68,18,95,79,52,74,1,98,3,26,3,74,32,23,79,81,
                37,39,21,24,18,22,71,47,44};
       // rightrotateDplace(arr,77);
        leftrotateArrayDplace(arr,47,77);
        System.out.println(Arrays.toString(arr));
    }
}
