package com.Strings.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sum_of_Beauty_of_all_substring {

    public static int sum_of_Beauty_of_all_substring(String str){
        ArrayList<String>list=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            String s= "";
            for(int j=i;j<str.length();j++){
                s=s+str.charAt(j);
                list.add(s);
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            sum+=frequency(s);
        }
        return sum;
    }

    public static int frequency(String s) {
        if(s.length()<=1){
            return 0;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }
           else{
               map.put(ch,1);
           }
        }
        if(map.size()==1){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(Map.Entry<Character,Integer>e : map.entrySet()){
            max=Math.max(max,e.getValue());
            min=Math.min(min,e.getValue());
        }
        int result =max-min;
        return result;
    }

    public static void main(String[] args) {
        String s="aabcbaa";
        System.out.println( sum_of_Beauty_of_all_substring(s));
    }
}
