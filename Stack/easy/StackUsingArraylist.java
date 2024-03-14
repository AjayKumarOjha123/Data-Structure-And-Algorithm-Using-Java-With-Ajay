package com.Stack.easy;

import java.util.ArrayList;

public class StackUsingArraylist {
    static ArrayList<Integer>all=new ArrayList<>();
   static int top=-1;

    //add / Push Element On Stack

    public static int push(int data){
        top++;
        all.add(data);
        return all.get(top);
    }

    //Pop Function
    public static int pop(){

        if(all.isEmpty()){
            System.out.println("Stack is Empty");
        }
        int res= all.remove(top);
        top--;
        return res;
    }

    //Peek Function
    public static int peek(){
        if(all.isEmpty()){
            System.out.println("Stack is Empty");
        }
        int res=all.get(top);
        return res;
    }

    //Print Function

    public static void print(ArrayList<Integer>all){
        while(!all.isEmpty()){
            System.out.print(peek()+" ");
            pop();
        }
    }

    public static void main(String[] args) {
       push(10);
       push(20);
       push(23);
       push(345);
        System.out.println(peek());
        System.out.println(pop());
        System.out.println(pop());
        print(all);



    }
}
