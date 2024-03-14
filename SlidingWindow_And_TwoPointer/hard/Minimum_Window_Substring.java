package com.SlidingWindow_And_TwoPointer.hard;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Window_Substring {
    public static String minWindow(String s, String t) {
        int n = s.length();

        if (t.length() > n)
            return "";

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int requiredCount = t.length();
        int left = 0, right = 0;

        int minWindowSize = Integer.MAX_VALUE;
        int start_left = 0;

        while (right < n) {
            char ch = s.charAt(right);

            if (map.containsKey(ch) && map.get(ch) > 0){
                requiredCount--;
            }
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }else{
                map.put(ch,-1);
            }
            while (requiredCount == 0) {
                int currWindowSize = right - left + 1;
                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    start_left = left;
                }

                char start = s.charAt(left);
                if(map.containsKey(start)){
                    map.put(start,map.get(start)+1);
                }else{
                    map.put(start,-1);
                }
                if (map.containsKey(start) && map.get(start) > 0) {
                    requiredCount++;
                }

                left++;
            }

            right++;
        }

        return minWindowSize == Integer.MAX_VALUE ? "" : s.substring(start_left, start_left + minWindowSize);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        System.out.println(minWindow(s,t));
    }
}
