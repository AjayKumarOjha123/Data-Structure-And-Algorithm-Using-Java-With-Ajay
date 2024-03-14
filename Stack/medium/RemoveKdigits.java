package com.Stack.medium;

import java.util.Collections;
import java.util.Stack;

public class RemoveKdigits {
    public static String removeKdigits(String num, int k) {
        if(k>=num.length()){
            return "0";
        }
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int val=ch-'0';
            if(st.isEmpty()){
                st.push(val);
            }
            else if(st.peek()<=val){
                st.push(val);
            }
            else{
                if(k>0) {
                    st.pop();
                    k--;
                    st.push(val);
                }
                else{
                    while(i<num.length()){
                        char c=num.charAt(i);
                        int v=c-'0';
                        st.push(v);
                    }
                    break;
                }
            }
        }
        if(k!=0){
            while(!st.isEmpty() && k>0){
                st.pop();
                k--;
            }
        }
        Collections.reverse(st);
        String s="";
        while(!st.isEmpty()){
            s+=st.pop();
        }
        String ans="";
        int start=0;
        if(s.length()>0 && s.charAt(0)=='0'){
            while(s.length()>0 && s.charAt(start)=='0'){
                start++;
            }
            for(int i=start;i<s.length();i++){
                ans+=s.charAt(i);
            }
            return ans;
        }
        else
        return s;
    }
    public static void main(String[] args) {
        String s="10200";
        System.out.println(removeKdigits(s,2));
    }
}
