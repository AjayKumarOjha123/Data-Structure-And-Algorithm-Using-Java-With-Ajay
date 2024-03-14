package com.Heaps.hard;

import java.util.*;

public class Top_K_Frequent_Elements {

    static class Pair{
        int freq;
        int num;
        public Pair(int freq, int num){
            this.freq = freq;
            this.num = num;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq); // Max heap
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(new Pair(entry.getValue(), entry.getKey()));
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.remove().num;
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }
}
