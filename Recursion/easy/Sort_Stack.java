package com.Recursion.easy;
import java.util.Stack;
public class Sort_Stack {

    public static void sortStack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int data=s.pop();
        sortStack(s);
        pushRightPosition(s,data);
    }


    private static void pushRightPosition(Stack<Integer> s, int data) {
        if(s.isEmpty() || s.peek()<data){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushRightPosition(s,data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(1);
        stack.push(9);
        stack.push(7);
        stack.push(4);
        stack.push(0);
        sortStack(stack);
        //System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
