package com.Queue;

public class CircularQueueUsingArray {

    static class Queue{
       static int arr[];
       static int front=-1;
       static int rear=-1;
      static   int size;

        Queue(int size){
            arr=new int[size];
            this.size=size;
        }

        // isEmpty Method
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return true;
            }
            return false;
        }

        // isFull Method
        public static boolean isFull(){
            if((rear+1)%size==front){
                return true;
            }
            return false;
        }

        //Add Method

        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            // Jab Pahla Element Add Ho Raha Hai
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //Remove Method

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int res=arr[front];
            // Jab Single Elemnt Ho
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return res;
        }

        // Peek Method

        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int res=arr[front];
            return res;
        }

        // Print Queue Method
        public static void print(){
            while(!isEmpty()){
                System.out.print(peek()+" ");
                remove();
            }
        }

    }

    public static void main(String[] args) {
            Queue q=new Queue(5);
            q.add(10);
            q.add(20);
            q.add(30);
           q.print();

    }
}
