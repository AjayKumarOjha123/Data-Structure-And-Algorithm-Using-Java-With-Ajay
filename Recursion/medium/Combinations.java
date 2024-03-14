package com.Recursion.medium;
import java.util.*;
public class Combinations {
    public  static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>list=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        helper(1,n,k,list,temp);
        return list;
    }
    public static void helper(int start,int n,int k,List<List<Integer>>list,List<Integer>temp){
        if(k==0){
            List<Integer>data=new ArrayList<>(temp);
            list.add(data);
            return;
        }
        if(start>n){
            return;
        }
// add data
        temp.add(start);
        helper(start+1,n,k-1,list,temp);
//remove data
        temp.remove(temp.size()-1);
        helper(start+1,n,k,list,temp);
    }
    public static void main(String[] args) {
        System.out.println(combine(3,2));
    }
}
