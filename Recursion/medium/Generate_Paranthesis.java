package com.Recursion.medium;

import java.util.*;

public class Generate_Paranthesis {

    public static List<String> generateParenthesis(int n) {
            List<String>list=new ArrayList<>();
            int open=0;
            int close=0;
            helper(list,open,close,"",n);
            return list;
    }

    private static void helper(List<String> list, int open, int close, String s,int n) {
        if(open==n && close==n){
            list.add(s);
            return;
        }

        if(open<n){
            helper(list,open+1,close, s+"(",n);
        }
        if(open>close){
            helper(list,open,close+1,s+")",n);
        }
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(generateParenthesis(n));
    }
}
