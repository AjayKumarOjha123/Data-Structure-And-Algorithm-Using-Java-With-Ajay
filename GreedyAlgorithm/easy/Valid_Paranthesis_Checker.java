package com.GreedyAlgorithm.easy;
import java.util.*;
public class Valid_Paranthesis_Checker {
    public static boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left.push(i);
            } else if (c == '*') {
                star.push(i);
            } else { // c == ')'
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }
        while (!left.isEmpty() && !star.isEmpty()) {
            if (left.peek() < star.peek()) {
                left.pop();
                star.pop();
            } else {
                return false;
            }
        }

        return left.isEmpty();
    }
    public static void main(String[] args) {
        String s="(*)";
        System.out.println(checkValidString(s));
    }
}
