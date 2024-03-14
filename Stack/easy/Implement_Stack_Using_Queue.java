package com.Stack.easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Implement_Stack_Using_Queue {
   static Queue<Integer>q1=new LinkedList<>();
   static Queue<Integer>q2=new LinkedList<>();

    public int getSize() {
        // Implement the getSize() function.
        if(!q1.isEmpty()){
            return q1.size();
        }
        return q2.size();
    }

    public static boolean isEmpty() {
        // Implement the isEmpty() function.
        if(q1.isEmpty() && q2.isEmpty()){
            return true;
        }
        return false;
    }

    public static void push(int element) {
        // Implement the push(element) function.
        if(!q1.isEmpty()){
            q1.add(element);
        }
        else{
            q2.add(element);
        }
    }
    public static int pop() {
        // Implement the pop() function.
        if(isEmpty()){
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                if(q1.isEmpty()){
                    break;
                }
                q2.add(top);
            }

        }
        else {
            while(!q2.isEmpty()){
                top=q2.remove();
                if(q2.isEmpty()){
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    public static int top() {
        // Implement the top() function.
        if(isEmpty()){
            return -1;
        }
        int top=-1;
        if(!q1.isEmpty()){
            while(!q1.isEmpty()){
                top=q1.remove();
                q2.add(top);
            }

        }
        else {
            while(!q2.isEmpty()){
                top=q2.remove();
                q1.add(top);
            }
        }
        return top;
    }
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
    }
}
