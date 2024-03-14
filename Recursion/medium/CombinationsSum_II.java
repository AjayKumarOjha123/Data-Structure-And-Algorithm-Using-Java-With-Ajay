package com.Recursion.medium;
import java.util.*;
public class CombinationsSum_II {

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>>list=new HashSet<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,candidates,target,list,temp);
        List<List<Integer>>ans=new ArrayList<>(list);
        return ans;
    }

    public static void helper(int start,int []arr,int k,Set<List<Integer>>list,List<Integer>temp){
        if(start==arr.length){
            if(k==0){
                List<Integer>data=new ArrayList<>(temp);
                list.add(data);
            }
            return;
        }
        if(arr[start]<=k){
            temp.add(arr[start]);
            helper(start+1,arr,k-arr[start],list,temp);
            temp.remove(temp.size()-1);
        }
        helper(start+1,arr,k,list,temp);
    }

    //Optimal Apporoach

    public static List<List<Integer>> combinationSum_II(int[] arr, int k) {
        Arrays.sort(arr);
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        help(0,arr,k,list,temp);
        return list;
    }

    private static void help(int idx, int[] arr, int k, List<List<Integer>> list, List<Integer> temp) {
        if(k==0){
            ArrayList<Integer>data=new ArrayList<>(temp);
            list.add(data);
            return;
        }

        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }

            if(arr[i]>k){
                break;
            }

            temp.add(arr[i]);
            help(i+1,arr,k-arr[i],list,temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args) {
        int arr[]={2,5,2,1,2};
        int k=5;
       // System.out.println(combinationSum2(arr,k));
        System.out.println(combinationSum_II(arr,k));
    }
}
