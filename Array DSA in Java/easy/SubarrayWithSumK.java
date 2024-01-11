package com.Array.easy;

import java.util.ArrayList;

public class SubarrayWithSumK {

    public static ArrayList<Integer> subarraysumK(int arr[],int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==n){
                    list.add(i);
                    list.add(j);
                    return list;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={1,-3,2,4,6};
        System.out.println( subarraysumK(arr,6));
    }
}
