package com.Heaps.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Find_Median_from_Data_Stream {

    class MedianFinder {
        PriorityQueue<Integer>max=new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer>min=new PriorityQueue<>();
        public MedianFinder() {

        }

        public void addNum(int num) {
            if (max.isEmpty() || num <= max.peek()) {
                max.add(num);
            } else {
                min.add(num);
            }

            // Balance the heaps
            if (max.size() > min.size() + 1) {
                min.add(max.remove());
            } else if (min.size() > max.size()) {
                max.add(min.remove());
            }
        }
        public double findMedian() {
            if((min.size()+max.size())%2!=0){
                return max.peek();
            }
            else{
                return (max.peek()+min.peek())/2.0;
            }
        }
    }

    /**
     * Your MedianFinder object will be instantiated and called as such:
     * MedianFinder obj = new MedianFinder();
     * obj.addNum(num);
     * double param_2 = obj.findMedian();
     */
    public static void main(String[] args) {

    }
}
