package com.Stack.medium;
import java.util.*;
public class SubarraySumminimum {
    public  static int sumSubarrayMins(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int min=Integer.MAX_VALUE;
                for(int k=i;k<=j;k++){
                    min=Math.min(min,arr[k]);
                }
                sum+=min;
            }
        }
        System.out.println(sum);
        return sum;
    }

    //Optimal Apporoach
     class Solution {
        public int[] getNSL(int[] arr, int n) {
            int[] result = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                    st.pop();
                }

                result[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }

            return result;
        }

        public int[] getNSR(int[] arr, int n) {
            int[] result = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                    st.pop();
                }

                result[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }

            return result;
        }

        public int sumSubarrayMins(int[] arr) {
            int n = arr.length;

            int[] NSL = getNSL(arr, n);
            int[] NSR = getNSR(arr, n);

            long sum = 0;
            int M = 1000000007;

            for (int i = 0; i < n; i++) {
                long d1 = i - NSL[i];
                long d2 = NSR[i] - i;

                long totalWaysForIMin = d1 * d2;
                long sumIInTotalWays = arr[i] * totalWaysForIMin;

                sum = (sum + sumIInTotalWays) % M;
            }

            return (int) sum;
        }
    }
    public static void main(String[] args) {
      int []  arr = {11,81,94,43,3};
    }
}
