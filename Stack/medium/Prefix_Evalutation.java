package com.Stack.medium;

import java.util.Stack;

public class Prefix_Evalutation {

    public static void prefix(String str){
        Stack<Integer>s=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
                s.push(ch-'0');
            }
            else{
                int v1=s.pop();
                int v2=s.pop();
                if(ch=='+')s.push(v1+v2);
                if(ch=='-')s.push(v1-v2);
                if(ch=='*')s.push(v1*v2);
                if(ch=='/')s.push(v1/v2);
            }
        }
        System.out.println(s.peek());
    }
    public static void main(String[] args) {
        String str="-9/*+5346";
        prefix(str);
    }
}
