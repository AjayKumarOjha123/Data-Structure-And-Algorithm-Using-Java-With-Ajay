package com.ArrayList;

import java.util.ArrayList;

public class Arraylist {
   static ArrayList<Integer>al=new ArrayList<>();

   //Arraylist add Method

    public static void add(int data){
        al.add(data);
    }

    //Arraylist add Method
    public static void remove(int idx){
        al.remove(idx);
    }

    //Arraylist Set Method

    public static void set(int idx , int num){
        al.set(idx,num);
    }

    // Arraylist get Method

    public static int get(int idx){
       int res= al.get(idx);
       return res;
    }

   // Arraylist Print Function

    public static void print(){
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }


    public static void main(String[] args) {
        add(1234);
        add(3456);
        add(345);
        set(0,1235);
        print();
        System.out.println(get(0));

    }
}
