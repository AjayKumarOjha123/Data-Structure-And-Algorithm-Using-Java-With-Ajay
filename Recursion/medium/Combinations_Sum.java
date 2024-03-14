package com.Recursion.medium;
import java.util.*;
public class Combinations_Sum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(0,candidates,target,list,temp);
        return list;
    }

    public static void helper(int start,int []arr,int k,List<List<Integer>>list,List<Integer>temp){
        if(start==arr.length){
            if(k==0){
                List<Integer>data=new ArrayList<>(temp);
                list.add(data);
            }
            return;
        }
        if(arr[start]<=k){
            temp.add(arr[start]);
            helper(start,arr,k-arr[start],list,temp);
            temp.remove(temp.size()-1);
        }
        helper(start+1,arr,k,list,temp);
    }
    public static void main(String[] args) {
            int arr[]={2,3,4,5};
            int target=7;
        System.out.println(combinationSum(arr,target));
    }
}
