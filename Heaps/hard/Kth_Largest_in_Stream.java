package com.Heaps.hard;
import java.util.*;
public class Kth_Largest_in_Stream {
   static PriorityQueue<Integer>pq=new PriorityQueue();
   static int K;
    public void KthLargest(int k, int[] nums) {
        K=k;
        for(int num : nums){
            pq.add(num);
            if(pq.size()>k){
                pq.remove();
            }
        }
    }

    public int add(int val) {
        pq.add(val);
        if(pq.size()>K){
            pq.remove();
        }
        return pq.peek();
    }
    public static void main(String[] args) {

    }
}
