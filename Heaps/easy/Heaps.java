package com.Heaps.easy;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(5);
        pq.add(3);
        pq.add(7);
        pq.add(1);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
