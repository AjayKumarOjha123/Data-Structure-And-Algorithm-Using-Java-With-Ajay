package com.Recursion.medium;
import java.util.*;
public class Combinations_Sum_III {

    public static List<List<Integer>> combinationSum3(int k, int target) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        help(1,9,k,target,list,temp);
        return list;
    }
    private static void help(int start,int end, int k,int target, List<List<Integer>> list, List<Integer> temp) {
        if(target==0 && temp.size()==k){
            ArrayList<Integer>data=new ArrayList<>(temp);
            list.add(data);
            return;
        }
        for(int i=start;i<=end;i++){
            temp.add(i);
            help(i+1,end,k,target-i,list,temp);
            temp.remove(temp.size()-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }
}
