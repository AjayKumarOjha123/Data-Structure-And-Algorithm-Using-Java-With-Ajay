package com.Stack.hard;

import java.util.Stack;

public class Stock_Span_Problem {
   static class Pair<T, U> {
        int price;
        int span;

        Pair(T price, U span) {
            this.price = (int) price;
            this.span = (int) span;
        }
    }
   static Stack<Pair<Integer,Integer>>s=new Stack<>();
    public static int next(int price) {
        int span=1;
        while(!s.isEmpty() && s.peek().price<price){
            span+=s.pop().span;
        }
        s.push(new Pair<>(price,span));
        return span;
    }


    public static void main(String[] args) {
        System.out.println(next(85));
        System.out.println(next(80));
        System.out.println(next(60));
        System.out.println(next(70));
        System.out.println(next(60));
        System.out.println(next(75));
        System.out.println(next(85));


    }
}
