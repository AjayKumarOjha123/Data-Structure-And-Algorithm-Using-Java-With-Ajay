package com.Strings.easy;

import java.util.Arrays;

public class Longest_Common_Prefix {
    public static int[] longest_Common_Prefix(String s1, String s2){
        int ans[]=new int[2];
        for(int i=0;i<s1.length();i++){
            if(s2.contains(s1.substring(0,i+1))){
                ans[0]=0;
                ans[1]=i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
     String   str1 = "practicegeeks";
     String    str2 = "coderpractice";
     System.out.println(Arrays.toString(longest_Common_Prefix(str1,str2)));

    }
}
