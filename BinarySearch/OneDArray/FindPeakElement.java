package com.BinarySearch.OneDArray;

public class FindPeakElement {

    //Brute Force Apporoach.
    public static int find_Peak_Element(int arr[]){
        int n=arr.length;
        if(n==1){
            return 0;
        }
        for(int i=0;i<arr.length;i++){
            if(i==0){
                if(arr[i]>arr[i+1]){
                    return i;
                }
            }
            else if(i==n-1){
                if(arr[i]>arr[i-1]){
                    return i;
                }
            }
            else{
                if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
        System.out.println(find_Peak_Element(arr));
    }
}
