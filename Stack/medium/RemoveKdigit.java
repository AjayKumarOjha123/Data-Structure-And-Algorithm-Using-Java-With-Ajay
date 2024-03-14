package com.Stack.medium;

import java.util.Stack;

public class RemoveKdigit {
    public static String removeKdigits(String num, int k) {
        int n = num.length();
        Stack<Character> mystack = new Stack<>();

        for(char c: num.toCharArray()) {
            while(!mystack.isEmpty() && k > 0 && mystack.peek() > c) {
                mystack.pop();
                k -= 1;
            }
            if(!mystack.isEmpty() || c != '0') {
                mystack.push(c);
            }
        }

        while(!mystack.isEmpty() && k>0) {
            mystack.pop();
            k--;
        }
        if(mystack.isEmpty()) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        while(!mystack.isEmpty()) {
            sb.append(mystack.pop());
        }
        sb.reverse();
        System.out.println(sb);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="10200";
        removeKdigits(str,1);
    }
}
