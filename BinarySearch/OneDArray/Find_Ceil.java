package com.BinarySearch.OneDArray;

public class Find_Ceil {
    public static int find_Ceil(int arr[],int x){
        int ceil=-1;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]>=x){
                ceil=arr[mid];
            }
            if(arr[mid]<x){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
      int  n=6, x=5, a[]={3, 4, 7, 8, 8, 10};
        System.out.println(find_Ceil(a,x));
    }
}
