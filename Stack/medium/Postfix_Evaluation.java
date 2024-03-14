package com.Stack.medium;

import java.util.Stack;

public class Postfix_Evaluation {
    public static void postfix(String str){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
                s.push(ch-'0');
            }
            else{
                int v2=s.pop();
                int v1=s.pop();
                if(ch=='+')s.push(v1+v2);
                if(ch=='-')s.push(v1-v2);
                if(ch=='*')s.push(v1*v2);
                if(ch=='/')s.push(v1/v2);
            }
        }
        System.out.println(s.peek());
    }
    public static void main(String[] args) {
        String str="953+4*6/-";
        postfix(str);
    }
}
