package com.Array.Hard;

import java.util.HashMap;

public class LargestSubarrayWithZeroSum {

    public static int largestSubarrayZeroSum(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int largest = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0) {
                largest=i+1;
            } else {
                if (map.containsKey(sum)) {
                    largest = Math.max(largest, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return largest;
    }
    public static void main(String[] args) {
      int arr[] = {-1 ,1 ,-1 ,1};
        System.out.println(largestSubarrayZeroSum(arr));
    }
}
