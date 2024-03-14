package com.Strings.easy;

import java.util.Arrays;

public class Check_if_two_strings_are_anagram_of_each_other {
    public static boolean check_if_two_strings_are_anagram_of_each_other(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        s1 = new String(ch);
        s2 = new String(ch2);
        for (int i = 0; i < s1.length(); i++) {
            char temp = s1.charAt(i);
            char temp2 = s2.charAt(i);
            if (temp != temp2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks", s2 = "forgeeksgeeks";
        System.out.println(check_if_two_strings_are_anagram_of_each_other(s1,s2));
    }
}
