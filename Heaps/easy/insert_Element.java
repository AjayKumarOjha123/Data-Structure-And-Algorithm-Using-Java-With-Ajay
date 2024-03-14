package com.Heaps.easy;

import java.util.ArrayList;

public class insert_Element {
     static class Heaps{
         static ArrayList<Integer>arr=new ArrayList<>();

         public static void add(int data){
             //add at last index
             arr.add(data);
             int x=arr.size()-1;//child index
             int par=(x-1)/2; //parent index

             //Min heap property manage
             while(arr.get(x)<arr.get(par)){
                 int temp=arr.get(x);
                 arr.set(x,arr.get(par));
                 arr.set(par,temp);

                 //opdate parent child
                 x=par;
                 par=(x-1)/2;
             }
             System.out.println(arr);
         }

         //peek Function
         public static int peek(){
             return arr.get(0);
         }

         public static int remove(){
             int data=arr.get(0);
             //First Swap with last index element;
             arr.set(0,arr.get(arr.size()-1));
             arr.set(arr.size()-1,data);

             //delete last data
             arr.remove(arr.size()-1);

             //Thik Karo Min heap property ko
             heapify(0);
             return data;
         }

         private static void heapify(int i) {
             int left = 2 * i + 1;
             int right = 2 * i + 2;
             int minidx = i;

             // check left child
             if (left < arr.size() && arr.get(minidx) > arr.get(left))
                 minidx = left;
             // check right child
             if (right < arr.size() && arr.get(minidx) > arr.get(right))
                 minidx = right;

             // check and swap
             if (minidx != i) {
                 int temp = arr.get(i);
                 arr.set(i, arr.get(minidx));
                 arr.set(minidx, temp);

                 // call for next level
                 heapify(minidx);
             }
         }
     }

    public static void main(String[] args) {
        Heaps hp=new Heaps();
        hp.add(45);
        hp.add(20);
        hp.add(29);
        hp.add(28);
        hp.add(21);
        System.out.println(hp.peek());
        System.out.println( hp.remove());
        System.out.println(hp.arr);
    }
}
