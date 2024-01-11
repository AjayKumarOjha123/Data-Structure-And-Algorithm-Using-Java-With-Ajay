package com.Array.Hard;

public class ReversePair {

    //Brute Force Apporoach
    public static int reversePair(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
      int  N = 6;
      int  arr[] = {3, 2, 4, 5, 1, 20};
        System.out.println(reversePair(arr,N));
    }
}
