package com.Recursion.medium;
import java.util.*;
public class Subset_Sum2 {

    public static List<List<Integer>> subsetsWithDup(int[] arr) {
        Arrays.sort(arr);
        Set<List<Integer>>set=new HashSet<>();
        List<Integer>temp=new ArrayList<>();
        help(0,arr,set,temp);
        List<List<Integer>>list=new ArrayList<>(set);
        return new ArrayList<>(set);
    }

    private static void help(int i, int[] arr, Set<List<Integer>> set, List<Integer> temp) {
        if(i==arr.length){
            ArrayList<Integer>data=new ArrayList<>(temp);
            set.add(data);
            return;
        }

        temp.add(arr[i]);
        help(i+1,arr,set,temp);

        temp.remove(temp.size()-1);
        help(i+1,arr,set,temp);
    }

    public static void main(String[] args) {
        int arr[]={12, 15, 20};
        System.out.println(subsetsWithDup(arr));
    }
}
