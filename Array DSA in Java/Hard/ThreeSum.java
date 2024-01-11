package com.Array.Hard;

import java.util.*;

public class ThreeSum {

    //Brute Force Apporoach

    public static ArrayList<ArrayList<Integer>> threeSum(int arr[],int target){
       HashSet<ArrayList<Integer>> mainlist=new HashSet<>();
        if(arr.length==0){
            return new ArrayList<>(mainlist);
        }
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               for(int k=j+1;k<arr.length;k++){
                   int sum=arr[i]+arr[j]+arr[k];
                   if(sum==target){
                       ArrayList<Integer>curr=new ArrayList<>();
                       curr.add(arr[i]);
                       curr.add(arr[j]);
                       curr.add(arr[k]);
                       mainlist.add(curr);
                   }
               }
           }
       }
       return new ArrayList<>(mainlist);
    }

    //Optimal Apporoach
    public static List<List<Integer>> threeSum(int[] nums) {
        HashSet<ArrayList<Integer>>set=new HashSet<>();
        if(nums.length==0){
            return new ArrayList<>(set);
        }

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[j]+nums[k];
                if(sum==-nums[i]){
                    ArrayList<Integer>temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                }
                else if(sum>-nums[i]){
                    k--;
                }
                else if(sum<-nums[i]){
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
     int []nums = {-1,0,1,2,-1,-4};
     System.out.println(threeSum(nums,3));
    }
}
