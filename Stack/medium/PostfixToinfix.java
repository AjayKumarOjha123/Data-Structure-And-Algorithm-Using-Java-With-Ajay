package com.Stack.medium;

import java.util.Stack;

public class PostfixToinfix {
    public static void postfixToInfix(String str){
        Stack<String>s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch-'0'>=0 && ch-'0'<=9){
                String val=""+ch;
                s.push(val);
            }
            else{
                String v2=s.pop();
                String v1=s.pop();
//                if(ch=='+')s.push(v1+"+"+v2);
//                if(ch=='-')s.push(v1+"-"+v2);
//                if(ch=='*')s.push(v1+"*"+v2);
//                if(ch=='/')s.push(v1+"/"+v2);

                //This is an efficient way to store
                  s.push('('+v1+ch+v2+')');
            }
        }
        System.out.println(s.peek());
    }
    public static void main(String[] args) {
        String str="953+4*6/-";
        postfixToInfix(str);
    }
}
