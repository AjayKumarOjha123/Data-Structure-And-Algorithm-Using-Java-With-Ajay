package com.SlidingWindow_And_TwoPointer.medium;

import java.util.HashMap;

public class BinarySubarrayWithSum {

    //Brute Force Apporoach
    public static int binary(int arr[],int goal){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==goal){
                    count++;
                }
            }
        }
        return count;
    }

    //Optimal Apporoach

    public static int numSubarraysWithSum(int[] arr, int goal) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int i=0;
        int sum=0;
        int res=0;
        map.put(0,1);
        while(i<arr.length){
            sum+=arr[i];
            int newgoal=sum-goal;
            if(map.containsKey(newgoal)){
                res+=map.get(newgoal);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
      int[]  nums = {1,0,1,0,1};
      int goal = 2;
         System.out.println(binary(nums,goal));
        System.out.println(numSubarraysWithSum(nums,goal));
    }
}
