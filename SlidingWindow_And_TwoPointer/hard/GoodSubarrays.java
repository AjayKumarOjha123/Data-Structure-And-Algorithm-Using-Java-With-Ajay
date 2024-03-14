package com.SlidingWindow_And_TwoPointer.hard;

import java.util.HashMap;

public class GoodSubarrays {
    public static int countSubarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int count = 0;
        int distinctCount = 0;

        while (right < n) {
            int num = nums[right];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
            if (map.get(num) == 1) {
                distinctCount++;
            }
            while (distinctCount > k) {
                int val = nums[left];
                map.put(val, map.get(val) - 1);
                if (map.get(val) == 0) {
                    distinctCount--;
                }
                left++;
            }
            count += right - left;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(countSubarraysWithKDistinct(nums, k)); // Output: 7
    }
}
