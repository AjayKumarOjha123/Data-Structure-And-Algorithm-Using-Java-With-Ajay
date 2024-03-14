package com.Strings.easy;

import java.util.HashMap;

public class Isomorphic_String {

    public static boolean areIsomorphic(String str1,String str2){

        if(str1.length()!=str2.length()){
            return false;
        }

        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Boolean>map2=new HashMap<>();
        for(int i=0;i< str1.length();i++){
            char ch=str1.charAt(i);
            char ch2=str2.charAt(i);

            if(map.containsKey(ch)){
                if(map.get(ch)!=ch2){
                    return false;
                }
            }
            else{
                if(map2.containsKey(ch2)){
                    return false;
                }
                else {
                    map.put(ch,ch2);
                    map2.put(ch2,true);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String  str1 = "aab";
        String  str2 = "xyz";
        System.out.println(areIsomorphic(str1,str2));
    }
}
