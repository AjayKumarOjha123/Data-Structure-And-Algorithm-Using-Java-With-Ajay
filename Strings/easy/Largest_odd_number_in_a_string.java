package com.Strings.easy;

public class Largest_odd_number_in_a_string {
    public static String largest_odd_number_in_a_string(String str){
        for(int i = str.length()-1; i>=0; i--){
            char ch=str.charAt(i);
            if((ch-0)%2!=0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
      String  s = "504";
        System.out.println(largest_odd_number_in_a_string(s));
    }
}
