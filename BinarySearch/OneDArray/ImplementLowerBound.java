package com.BinarySearch.OneDArray;

public class ImplementLowerBound {
    public static int lowerBound(int []arr, int n, int x) {
        //Brute Force Apporoach
        int idx=n;
        for(int i=0;i<n;i++){
            if(arr[i]>=x){
                idx=i;
                break;
            }
        }
        return idx;
    }

    //Optimal Apporoach

    public static int implementLowerBound(int arr[],int x){
        int idx=arr.length;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]>=x){
                idx=mid;
            }
            if(arr[mid]<x){
                si=mid+1;
            }
            else {
                ei=mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[]={1 ,2 ,2 ,3 ,3 ,5},x= 4;
       // System.out.println(lowerBound(arr,arr.length,x));
        System.out.println(implementLowerBound(arr,x));
    }
}
