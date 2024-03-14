package com.BinarySearch.OneDArray;

public class Find_minimum_in_Rotated_Sorted_Array {
    //Brute Force Apporoach
    public static int find_minimum_in_Rotated_Sorted_Array(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

    //Optimal Apporoach
    public static int find_minimum_Rotated_Sorted_Array(int arr[]){
        int min=Integer.MAX_VALUE;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[si]<=arr[mid]){
                min=Math.min(min,arr[si]);
                si=mid+1;
            }
            else{
               min=Math.min(min,arr[mid]);
               ei=mid-1;
            }
        }
        return min;
    }

    public static void main(String[] args) {
       int arr[] = {4 ,5 ,1 ,2 ,3};
        System.out.println( find_minimum_in_Rotated_Sorted_Array(arr));
        System.out.println(find_minimum_Rotated_Sorted_Array(arr));
    }
}
