package com.Strings.easy;

import java.util.Stack;

public class Reverse_words_in_a_given_string {
    public static String reverse_words_in_a_given_string(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        String sb=new String();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='.'){
               stack.push(sb);
               sb="";
            }
            else{
                sb+=(ch);
            }
        }
        stack.push(sb);
        while(stack.size()>0){
            ans.append(stack.peek());
            if(stack.size()>1){
                ans.append('.');
            }
            stack.pop();
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        System.out.println(reverse_words_in_a_given_string(s));
    }
}
