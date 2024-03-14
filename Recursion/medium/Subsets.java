package com.Recursion.medium;
import java.util.*;
public class Subsets {
    public static List<List<Integer>> subsets(int nums[],int k) {
        Set<List<Integer>> list = new HashSet<>();
        List<Integer> temp = new ArrayList<>();
        helper(0, nums, k,temp, list);
        return new ArrayList<>(list);
    }

    public static void helper(int idx, int arr[],int k, List<Integer> temp, Set<List<Integer>> list) {
        if (idx == arr.length) {
            ArrayList<Integer> data = new ArrayList<>(temp);
            Collections.sort(data);
            int sum=0;
            for(int a : data){
                sum+=a;
            }
            if(sum==k)
            list.add(data);
            return;
        }
        temp.add(arr[idx]);
        helper(idx + 1, arr,k, temp, list);
        temp.remove(temp.size() - 1);
        helper(idx + 1, arr,k, temp, list);
    }

    public static void main(String[] args) {
        int[] nums = {2,5,2,1,2};
        List<List<Integer>> list = subsets(nums,5);
        System.out.println(list);
    }
}
