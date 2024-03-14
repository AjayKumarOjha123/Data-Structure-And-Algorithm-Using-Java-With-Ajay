package com.Recursion.hard;
import java.util.*;
public class Word_Break {
    public static boolean wordBreak(String s, List<String> wordDict) {
           return help(0,s,wordDict);
    }

    private static boolean help(int i, String s, List<String> wordDict) {
        if(i==s.length())return true;
        if(wordDict.contains(s))return true;
        for(int j=i+1;j<=s.length();j++){
            String temp=s.substring(i,j);
            if(wordDict.contains(temp) && help(j,s,wordDict)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      String  s = "catcatsandcat";
      List<String>wordDict=new ArrayList<>();
            wordDict.add("cats");
            wordDict.add("dog");
            wordDict.add("sand");
            wordDict.add("and");
            wordDict.add("cat");
    System.out.println( wordBreak(s,wordDict));
    }
}
