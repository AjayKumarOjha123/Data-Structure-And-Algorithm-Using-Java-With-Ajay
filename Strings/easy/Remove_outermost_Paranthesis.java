package com.Strings.easy;

import java.util.Stack;

public class Remove_outermost_Paranthesis {

    public static String remove_outermost_Paranthesis(String s){
        Stack<Character>stack=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                if(stack.size()>0){
                    sb.append(ch);
                }
                stack.push(ch);
            }
            else{
                stack.pop();
                if(stack.size()>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
     String  s = "(()())(())";
     System.out.println(remove_outermost_Paranthesis(s));
    }
}
