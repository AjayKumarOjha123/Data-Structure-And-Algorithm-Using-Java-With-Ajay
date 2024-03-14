package com.BinarySearch.OneDArray;

public class Search_in_a_Rotated_Array {

    //Brute Force Apporoach
    public static int search_in_a_Rotated_Array(int arr[],int key,int l,int h){
        int si=l;
        int ei=h;
        for(int i=0;i<arr.length;i++){
           if(arr[i]==key){
               return i;
           }
       }
        return -1;
    }

    //Optimal Apporoach
    public static int search_a_Rotated_Array(int arr[],int key,int l,int h){
        int si=l;
        int ei=h;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[si]<=arr[mid]){
                if(arr[si]<=key && arr[mid]>=key){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            else{
                if(arr[mid]<=key && arr[ei]>=key){
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
       int N = 9;
       int  arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
       int key = 10;
       int l = 0 , h = 8;
       System.out.println(search_in_a_Rotated_Array(arr,key,l,h));
       System.out.println(search_a_Rotated_Array(arr,key,l,h));
    }
}
