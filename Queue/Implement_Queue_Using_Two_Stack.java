package com.Queue;

import java.util.Queue;
import java.util.Stack;

public class Implement_Queue_Using_Two_Stack {
   static class Solution{
        static class Queue {
            // Define the data members(if any) here.
            Stack<Integer>s1=new Stack<>();
            Stack<Integer>s2=new Stack<>();

            Queue() {
                // Initialize your data structure here.
            }

            void enQueue(int val) {
                // Implement the enqueue() function.
                if(s1.isEmpty()){
                    s1.push(val);
                }
                else{
                    while(!s1.isEmpty()){
                        s2.push(s1.pop());
                    }

                    s1.push(val);
                    while(!s2.isEmpty()){
                        s1.push(s2.pop());
                    }
                }
            }

            int deQueue() {
                // Implement the dequeue() function.
                if(s1.isEmpty())return -1;
                int res=s1.pop();
                return res;
            }

            int peek() {
                // Implement the peek() function here.
                if(s1.isEmpty())return -1;
                return s1.peek();
            }

            boolean isEmpty() {
                // Implement the isEmpty() function here.
                return s1.isEmpty();
            }
        }
    }
    public static void main(String[] args) {
        Solution.Queue q=new Solution.Queue();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        System.out.println(q.deQueue());
    }
}
