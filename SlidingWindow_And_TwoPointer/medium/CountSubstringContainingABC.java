package com.SlidingWindow_And_TwoPointer.medium;

public class CountSubstringContainingABC {
    public static int numberOfSubstrings(String arr) {
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            for (int j = i; j < arr.length(); j++) {
                int a = 0, b = 0, c = 0;
                for (int k = i; k <= j; k++) {
                    if (arr.charAt(k) == 'a') a = 1;
                    if (arr.charAt(k) == 'b') b = 1;
                    if (arr.charAt(k) == 'c') c = 1;
                }
                if (a == 1 && b == 1 && c == 1) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="ababc";
        System.out.println(numberOfSubstrings(str));
    }
}
