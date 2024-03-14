package com.Stack.easy;

import java.util.LinkedList;

public class Implement_Stack_using_Linkedlist<T> {
    LinkedList<T>ll=new LinkedList<>();
    int getSize()
    {
        //Write your code here
        return ll.size();
    }

    boolean isEmpty()
    {
        //Write your code here
        return ll.isEmpty();
    }

    void push(T data)
    {
        //Write your code here
        ll.addFirst(data);
    }

    void pop()
    {
        //Write your code here
        ll.removeFirst();
    }

    T getTop()
    {
        //Write your code here
        return ll.peekFirst();
    }
    public static void main(String[] args) {
        Implement_Stack_using_Linkedlist<Object> ll=new Implement_Stack_using_Linkedlist();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push("4");
        System.out.println(ll.getTop());
        ll.pop();
        System.out.println(ll.getTop());
        Implement_Stack_using_Linkedlist<String> l=new Implement_Stack_using_Linkedlist();
        l.push("Hello");
        l.push("Ajay");
        l.push("Sonu");
        System.out.println(l.getTop());
    }
}
