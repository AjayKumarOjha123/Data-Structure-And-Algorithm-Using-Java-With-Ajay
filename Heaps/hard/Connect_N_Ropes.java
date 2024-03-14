package com.Heaps.hard;

import java.util.PriorityQueue;

public class Connect_N_Ropes {
    static int minCost(int arr[], int n) {
        PriorityQueue pq=new PriorityQueue();
        for (int i=0;i<n;i++){
            pq.add(arr[i]);
        }

        int cost=0;
        while(pq.size()>1) {
            int ropes1 = (int) pq.remove();
            int ropes2 = (int) pq.remove();

            int length = ropes1 + ropes2;
            cost += length;
            pq.add(length);
        }
        return cost;
    }
    public static void main(String[] args) {
      int arr[]={4 ,3, 2, 6};
      int n=arr.length;
        System.out.println(minCost(arr,n));
    }
}
