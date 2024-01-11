package com.Array.Hard;

import java.util.HashMap;

public class CountNumberOfSubarray {
    public static int countNoOfSubarrayEqualK(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            int remove=sum-k;
           count+=map.getOrDefault(remove,0);
           map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
     int  Arr[] = {10 , 2, -2, -20, 10};
       // System.out.println(countNoOfSubarrayEqualK(Arr,-10));
    }
}
