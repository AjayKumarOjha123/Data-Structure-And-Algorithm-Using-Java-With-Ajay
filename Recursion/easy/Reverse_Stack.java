package com.Recursion.easy;

import java.util.Stack;

public class Reverse_Stack {

    public static void pushAtBootom(Stack<Integer>s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBootom(s,data);
        s.push(top);
    }
    public static void reverseStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBootom(s,top);
    }

    public static void print(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
    }
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverseStack(stack);
        print(stack);
    }
}
