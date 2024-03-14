package com.Stack.easy;

import java.util.Stack;

public class Valid_Paranthesis {
    public static boolean validParanthesis(String s){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                stack.push(ch);
                continue;
            }
            char check;
            switch (ch){
                case ')':
                    check=stack.pop();
                    if(check=='{' || check=='[')return false;
                    break;

                case ']':
                    check=stack.pop();
                    if(check=='(' || check=='{')return false;
                    break;

                case '}':
                    check=stack.pop();
                    if(check=='(' || check=='[')return false;
                    break;
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       String s = "(}[]{}";
        System.out.println(validParanthesis(s));
    }
}
