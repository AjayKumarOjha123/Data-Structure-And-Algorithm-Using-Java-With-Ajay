package com.BinarySearch.OneDArray;

public class BinarySearchFindXinSortedArray {

    public static int binarySearch(int arr[],int k){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]<k){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int N = 5;
       int  arr[] = {1 ,2 ,3 ,4 ,5};
       int k=5;
       System.out.println(binarySearch(arr,k));
    }
}
