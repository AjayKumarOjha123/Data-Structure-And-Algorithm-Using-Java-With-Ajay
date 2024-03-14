package com.Queue;

public class QueueUsingArray {
   static class Queue{
     static int arr[];
       static int rear=-1;
      static int size;

       public Queue(int size){
           arr=new int[size];
           this.size=size;
       }
       public static boolean isEmpty(){
           return rear==-1;
       }

       //Enqueue Method
       public static void add(int data){
           if(rear==size-1){
               System.out.println("Queue is Full");
               return;
           }
           rear++;
           arr[rear]=data;
       }

       //Dequeue Method

       public static int remove(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
           int front=arr[0];
           for(int i=0;i<=rear;i++){
               arr[i]=arr[i+1];
           }
           rear--;
           return front;
       }

       // Peek Method

       public static int peek(){
           if(isEmpty()){
               System.out.println("Queue is Empty");
               return -1;
           }
           int front=arr[0];
           return front;
       }

   }

    public static void main(String[] args) {
       Queue q=new Queue(5);
       q.add(12);
       q.add(15);
       q.add(23);
       q.add(24);
       System.out.println(q.peek());
       q.remove();
        System.out.println(q.peek());
    }
}
