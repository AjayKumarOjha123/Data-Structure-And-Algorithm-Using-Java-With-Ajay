package com.Recursion.medium;
import java.util.*;
public class Subset_Sum_1 {

    public static ArrayList<Integer> subsetSum(int arr[]) {
        ArrayList<Integer>ans=new ArrayList<>();
        ArrayList<Integer>temp=new ArrayList<>();
        help(0,arr,ans,temp);
        Collections.sort(ans);
        return ans;
    }

    private static void help(int i, int[] arr, ArrayList<Integer> ans, ArrayList<Integer> temp) {
        if(i==arr.length){
            int sum=0;
            for(int a : temp){
                sum+=a;
            }
            ans.add(sum);
            return;
        }

        temp.add(arr[i]);
        help(i+1,arr,ans,temp);

        temp.remove(temp.size()-1);
        help(i+1,arr,ans,temp);
    }

    public static void main(String[] args) {
        int arr[]={4, 5};
        System.out.println(subsetSum(arr));
    }
}
