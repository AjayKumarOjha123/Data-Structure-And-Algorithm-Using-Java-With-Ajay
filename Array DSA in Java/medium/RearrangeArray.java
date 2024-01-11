package com.Array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeArray {

    public static void rearrangeArray(int arr[],int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg =new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
    }
    public static void main(String[] args) {
     int arr[]={9 ,4 ,-2, -1, 5, 0 ,-5 ,-3 ,2};
     int N=arr.length;
     rearrangeArray(arr,N);
     System.out.println(Arrays.toString(arr));
    }
}
