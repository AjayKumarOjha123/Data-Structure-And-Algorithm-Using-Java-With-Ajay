package com.Recursion.hard;
import java.util.*;
public class Palindrome_Partitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>>list=new ArrayList<>();
        List<String>temp=new ArrayList<>();
        help(0,s,list,temp);
        return list;
    }

    private static void help(int idx,String s, List<List<String>> list, List<String> temp) {
        if(idx==s.length()){
            ArrayList<String>data=new ArrayList<>(temp);
            list.add(data);
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(isPlaindrome(s,idx,i)){
                temp.add(s.substring(idx,i+1));
                help(i+1,s,list,temp);
                temp.remove(temp.size()-1);
            }
        }
    }

    private static boolean isPlaindrome(String s, int idx, int i) {
        int si=idx;
        int ei=i;
        while(si<=ei){
            if(s.charAt(si)!=s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(partition(""));
    }
}
