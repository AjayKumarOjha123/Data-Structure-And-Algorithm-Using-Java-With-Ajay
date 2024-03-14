package com.Recursion.medium;
import java.util.*;
public class Phone_Number {
    public static List<String> letterCombinations(String digits) {
        Map<Character,String>map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        List<String>ans=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        help(0,digits,map,ans,sb);
        return ans;
    }

    private static void help(int idx, String digits,Map<Character,String>map, List<String> ans, StringBuilder sb) {
        if(idx==digits.length()){
            StringBuilder data=new StringBuilder(sb);
            ans.add(data.toString());
            return;
        }

        String str=map.get(digits.charAt(idx));
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            help(idx+1,digits,map,ans,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
