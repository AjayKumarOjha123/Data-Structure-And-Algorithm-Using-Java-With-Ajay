package com.BinarySearch.OneDArray;

public class Search_in_Rotated_Sorted_Array_II {

    //Optimal Apporoach
    public static boolean search_in_Rotated_Sorted_Array_II(int arr[],int k){
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==k){
                return true;
            }
            if(arr[si]==arr[mid] && arr[mid]==arr[ei]){
                si=si+1;
                ei=ei-1;
                continue;
            }
            if(arr[si]<=arr[mid]){
                if(arr[si]<=k && arr[mid]>=k){
                    ei=mid-1;
                }
                else{
                    si=mid+1;
                }
            }
            else{
                if(arr[mid]<=k && arr[ei]>=k){
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,5,0,0,1,2};
        int k=6;
        System.out.println(search_in_Rotated_Sorted_Array_II(arr,k));
    }
}
