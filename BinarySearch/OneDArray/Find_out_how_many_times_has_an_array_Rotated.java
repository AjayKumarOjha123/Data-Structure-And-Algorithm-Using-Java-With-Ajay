package com.BinarySearch.OneDArray;

public class Find_out_how_many_times_has_an_array_Rotated {

    //Brute Force Apporoach.
    public static int findout_how_many_times_has_an_array_Rotated(int arr[]){
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                idx=i;
            }
        }
        return idx;
    }

    //Optimal Apporoach
    public static int find_out_how_many_times_has_an_array_Rotated(int arr[]){
        int min=Integer.MAX_VALUE;
        int idx=-1;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[si]<=arr[ei]){
                if(arr[si]<min) {
                    min = Math.min(min, arr[si]);
                    idx = si;
                }
                break;
            }
            if(arr[si]<=arr[mid]){
                min=Math.min(min,arr[si]);
                idx=si;
                si=mid+1;
            }
            else{
                if(arr[mid]<min) {
                    min = Math.min(min, arr[mid]);
                    idx = mid;
                    ei = mid - 1;
                }
            }
        }
        return idx;
    }
    public static void main(String[] args) {
       int arr[] = {66, 67, 7 ,10 ,14, 19 ,27, 33, 36 ,40 ,44 ,54 ,60};
        System.out.println( find_out_how_many_times_has_an_array_Rotated(arr));
        //System.out.println(findout_how_many_times_has_an_array_Rotated(arr));
    }
}
