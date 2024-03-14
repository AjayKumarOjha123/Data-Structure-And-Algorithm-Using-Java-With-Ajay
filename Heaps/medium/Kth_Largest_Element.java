package com.Heaps.medium;

import java.util.Arrays;

public class Kth_Largest_Element {
    public static int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k];
    }
    public static void main(String[] args) {
      int arr[]={3,2,1,5,6,4}, k = 2;
        System.out.println(findKthLargest(arr,k));
    }
}
