package com.Strings.medium;

import java.util.HashMap;

public class Roman_Number_to_Integer_and_vice_versa {
    public static int roman_Number_to_Integer_and_vice_versa(String str){
      /*  Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
       */
        HashMap<Character,Integer>map=new HashMap<>();
        map.put('I' ,1);
        map.put('V' ,5);
        map.put('X' ,10);
        map.put('L' ,50);
        map.put('C' ,100);
        map.put('D' ,500);
        map.put('M' ,1000);
        int n=str.length();
        int ans=0;
        for(int i=0;i<n;i++){
            if(i<n-1 && map.get(str.charAt(i))<map.get(str.charAt(i+1))){
                ans+=map.get(str.charAt(i+1))-map.get(str.charAt(i));
                i++;
            }
            else{
                ans+=map.get(str.charAt(i));
            }
        }
        return ans;

    }
    public static void main(String[] args) {
      String  s = "LVIII";
        System.out.println(roman_Number_to_Integer_and_vice_versa(s));
    }
}
