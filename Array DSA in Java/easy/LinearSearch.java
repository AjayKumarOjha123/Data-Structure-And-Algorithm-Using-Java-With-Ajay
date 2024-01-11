package com.Array.easy;

public class LinearSearch {

    //Brute Force Apporoach

    public static int linearSearch(int arr[],int n){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
