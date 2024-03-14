package com.Stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementCircularArray {
    public static int[] nextGreaterElementII(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();

        int[] newArray = new int[n * 2];
        for (int i = 0; i < n * 2; i++) {
            newArray[i] = arr[i % n];
        }

        for (int i = 2 * n - 1; i >= 0; i--) {
            NGE(newArray, i, s, ans);
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }

    private static void NGE(int[] arr, int i, Stack<Integer> s, int[] ans) {
        while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
            s.pop();
        }
        if (s.isEmpty()) {
            ans[i % ans.length] = -1;
        } else {
            int idx = s.peek();
            ans[i % ans.length] = arr[idx];
        }
        s.push(i);
    }
    public static void main(String[] args) {
        int arr[]={1,5,3,4,2};
        nextGreaterElementII(arr);
    }
}
