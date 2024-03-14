package com.SlidingWindow_And_TwoPointer.hard;

public class Minimum_Window_Subsequence {
            static String minWindow(String str1, String str2){
                // code here
                int left = 0;
                int right = 0;
                int temp = 0;
                int minsize = Integer.MAX_VALUE;
                String str = "";

                while (right < str1.length()) {
                    char ch1 = str1.charAt(right);
                    char ch2 = str2.charAt(temp);

                    if (ch1 == ch2) {
                        temp++;
                    }

                    if (temp == str2.length()) {
                        int newleft = right;

                        while (temp > 0) {
                            char temp1 = str1.charAt(newleft);
                            char temp2 = str2.charAt(temp - 1);

                            if (temp1 == temp2) {
                                temp--;
                            }

                            newleft--;
                        }

                        newleft++;

                        if (minsize > right - newleft + 1) {
                            str = str1.substring(newleft, right + 1);
                            minsize = right - newleft + 1;
                        }

                        // Move the left pointer to the next position
                        temp = 0;
                        right = newleft + 1;
                    }
                    right++;
                }
                return str;
            }
    public static void main(String[] args) {
        String str1= "geeksforgeeks";
        String str2="eksrg";
        System.out.println(minWindow(str1,str2));
    }
}
