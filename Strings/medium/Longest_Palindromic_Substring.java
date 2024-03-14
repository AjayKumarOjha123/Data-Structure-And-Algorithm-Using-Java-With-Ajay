package com.Strings.medium;

public class Longest_Palindromic_Substring {
    public static String longest_Palindromic_Substring(String str){
        int n=str.length();
        int max=Integer.MIN_VALUE;
        int sp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(checkPlaindrome(str,i,j)==true){
                   if(j-i+1>max){
                       max=j-i+1;
                       sp=i;
                   }
                }
            }
        }
        return str.substring(sp,sp+max);
    }
    public static boolean checkPlaindrome(String str,int si,int ei){
           while(si<=ei){
               if(str.charAt(si)!=str.charAt(ei)){
                   return false;
               }
               si++;
               ei--;
           }
           return true;
    }
    public static void main(String[] args) {
        String s = "aaabbbaa";
        System.out.println(longest_Palindromic_Substring(s));
    }
}
