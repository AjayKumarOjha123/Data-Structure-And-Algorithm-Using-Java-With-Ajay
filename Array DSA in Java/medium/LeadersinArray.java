package com.Array.medium;
import java.util.*;
public class LeadersinArray {
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer>leader=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean status=false;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    status=true;
                    continue;
                }
            }
            if(!status){
                leader.add(arr[i]);
            }
        }
        return leader;
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        System.out.println(leaders(arr,arr.length));
    }
}
