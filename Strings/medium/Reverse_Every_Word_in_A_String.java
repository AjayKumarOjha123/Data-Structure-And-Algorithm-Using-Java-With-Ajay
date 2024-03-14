package com.Strings.medium;

public class Reverse_Every_Word_in_A_String {
    public static String reverse_Every_Word_in_A_String(String str){
        String s[]=str.split(" ");
        String output="";
        for(int i=0;i<s.length;i++){
            String curr=s[i];
            String temp="";
           for(int j=curr.length()-1;j>=0;j--){
               temp+=curr.charAt(j);
           }
           if(i!=s.length-1){
               temp+=" ";
           }
           output+=temp;
        }
        return output;
    }
    public static void main(String[] args) {
      String  s = "Mr Ding";
      System.out.println(reverse_Every_Word_in_A_String(s));
    }
}
