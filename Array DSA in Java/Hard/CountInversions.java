package com.Array.Hard;

public class CountInversions {

    //Brute Force Apporoach
    public static int countInversions(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int N = 5, arr[] = {2, 4, 1, 3, 5};
        System.out.println(countInversions(arr,N));

    }
}
