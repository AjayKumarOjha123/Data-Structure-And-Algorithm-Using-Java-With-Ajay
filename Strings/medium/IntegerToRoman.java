package com.Strings.medium;

import java.util.ArrayList;
import java.util.HashMap;

public class IntegerToRoman {
    public static String integerToRoman(int num){
      /*  Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
       */
        ArrayList<Integer>val=new ArrayList<>();
        ArrayList<String>sym=new ArrayList<>();
        val.add(1000); sym.add("M");
        val.add(900); sym.add("CM");
        val.add(500); sym.add("D");
        val.add(400); sym.add("CD");
        val.add(100); sym.add("C");
        val.add(90); sym.add("XC");
        val.add(50); sym.add("L");
        val.add(40); sym.add("XL");
        val.add(10); sym.add("X");
        val.add(9); sym.add("IX");
        val.add(5); sym.add("V");
        val.add(4); sym.add("IV");
        val.add(1); sym.add("I");
        String ans="";
        for(int i=0;i<val.size();i++){
            if(num==0)break;
            int times=num/val.get(i);
            while(times!=0){
                ans+=sym.get(i);
                times--;
            }
            num=num%val.get(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(integerToRoman(1994));
    }
}
