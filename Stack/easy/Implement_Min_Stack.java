package com.Stack.easy;

import java.util.Stack;

public class Implement_Min_Stack {

  //  //Approach 1 Using Two Stack ////

   static class MinStack1 {
        Stack<Integer>stack=new Stack<>();
        Stack<Integer>min=new Stack<>();
        public void MinStack() {

        }

        public void push(int val) {
            if(stack.isEmpty() && min.isEmpty()){
                stack.push(val);
                min.push(val);
            }
            stack.push(val);
            if(stack.peek()<min.peek()){
                min.push(val);
            }
        }

        public void pop() {
            if(stack.isEmpty()){
                return;
            }
            if(stack.peek()==min.peek()){
                stack.pop();
                min.pop();
            }
            else {
                stack.pop();
            }
        }

        public int top() {
            if(stack.isEmpty())return -1;
            return stack.peek();
        }

        public int getMin() {
            if(min.isEmpty())return -1;
            return min.peek();
        }
    }


    // Apporoach 2 Using Single Stack And Node Class //

    static class MinStack {
        static class Node {
            int top;
            int min;

            Node (int top,int min){
                this.top=top;
                this.min=min;
            }
        }

        Stack<Node>s=new Stack<>();
        public MinStack() {

        }

        public void push(int val) {
           if(s.isEmpty()){
               Node newnode=new Node(val,val);
               s.push(newnode);
           }
           else{
               if(s.peek().min>val){
                   Node newnode=new Node(val,val);
                   s.push(newnode);
               }
               else{
                   int min=s.peek().min;
                   Node newnode=new Node(val,min);
                   s.push(newnode);
               }
           }
        }

        public void pop() {
           if(s.isEmpty())return;
           s.pop();
        }

        public int top() {
            if(s.isEmpty())return -1;
           int top=s.peek().top;
           return top;
        }

        public int getMin() {
          if(s.isEmpty())return -1;
          int min=s.peek().min;
          return min;
        }
    }



    /**
     * Your MinStack object will be instantiated and called as such:
     * MinStack obj = new MinStack();
     * obj.push(val);
     * obj.pop();
     * int param_3 = obj.top();
     * int param_4 = obj.getMin();
     */
    public static void main(String[] args) {
        MinStack m=new MinStack();
        m.push(1);
        m.push(34);
        m.push(-1);
        m.push(-2);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
    }
}
