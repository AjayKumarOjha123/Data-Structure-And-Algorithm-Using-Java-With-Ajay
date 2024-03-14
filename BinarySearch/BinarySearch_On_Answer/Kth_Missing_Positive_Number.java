package com.BinarySearch.BinarySearch_On_Answer;

public class Kth_Missing_Positive_Number {
    public static int kth_Missing_Positive_Number(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=k){
                k++;
            }
            else{
                break;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,7,11};
        int k=5;
        System.out.println(kth_Missing_Positive_Number(arr,k));
    }
}
