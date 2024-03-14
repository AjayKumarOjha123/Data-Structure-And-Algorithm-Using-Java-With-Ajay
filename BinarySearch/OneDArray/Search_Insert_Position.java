package com.BinarySearch.OneDArray;

public class Search_Insert_Position {
    public static int searchInsertPosition(int arr[],int k){
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
            else if(arr[i]>k){
                break;
            }
            idx++;
        }
        return idx;
    }

    //Optimal Apporoach
    public static int search_insert_Position(int arr[],int x){
        int si=0;
        int ei=arr.length-1;
        int idx=arr.length;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]>=x){
                idx= mid;
            }
            if(arr[mid]<x){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return idx;
    }
    public static void main(String[] args) {
      int  N = 4;
      int  Arr[] = {1, 3, 5, 6};
      int  k = 5;
      //System.out.println(searchInsertPosition(Arr,k));
        System.out.println(search_insert_Position(Arr,k));
    }
}
