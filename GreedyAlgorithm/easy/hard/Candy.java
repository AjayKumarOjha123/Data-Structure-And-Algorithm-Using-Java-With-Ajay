package com.GreedyAlgorithm.easy.hard;

import java.util.Arrays;

public class Candy {
    public static int candy(int[] ratings) {
        int n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        // Candy from left
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Candy from right
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            count += Math.max(left[i], right[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={1,0,2};
        System.out.println(candy(arr));
    }
}
