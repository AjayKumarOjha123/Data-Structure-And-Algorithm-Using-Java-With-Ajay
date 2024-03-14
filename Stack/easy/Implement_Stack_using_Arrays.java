package com.Stack.easy;

public class Implement_Stack_using_Arrays {

    static class Stack{
       static int top=-1;
       static int arr[];
       static int size=0;

       static int length=0;

        Stack(int size){
            arr=new int[size];
            this.size=size;
        }

        public static void push(int num) {
            // Write your code here.
            if(top==arr.length-1){
                System.out.println("Stack is Full");
                return;
            }
            top++;
            arr[top]=num;
            length++;
        }
        public static int pop() {
            // Write your code here.
            if(top==-1){
                System.out.println("Stack is Empty");
                return -1;
            }
            int res=arr[top];
            top--;
            length--;
            return res;
        }
        public static int top() {
            // Write your code here.
            if(top==-1){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
        public static int isEmpty() {
            // Write your code here.
            if(top==-1){
                return 1;
            }
            return 0;
        }
        public static int isFull() {
            // Write your code here.
            if(top==arr.length-1){
                return 1;
            }
            return 0;
        }

        public static void print(){
            while(isEmpty()==0){
                System.out.print(pop()+" ");
            }
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(6);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        s.print();
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
    }
}
