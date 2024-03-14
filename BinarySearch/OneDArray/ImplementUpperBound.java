package com.BinarySearch.OneDArray;

public class ImplementUpperBound {
    public static int implementUpperBound(int arr[],int x){
         int idx=arr.length;
         int si=0;
         int ei=arr.length-1;
         while(si<=ei){
             int mid=(si+ei)/2;
             if(arr[mid]>x){
                 idx=mid;
             }
             if(arr[mid]<=x){
                 si=mid+1;
             }
             else{
                 ei=mid-1;
             }
         }
         return idx;
    }
    public static void main(String[] args) {
       int arr[] = {1 ,4 ,7 ,8 ,10} , x = 7;
        System.out.println( implementUpperBound(arr,x));
    }
}
