package com.GreedyAlgorithm.easy;

import java.util.Arrays;
import java.util.Comparator;

public class Fractional_Knapsack {
    public static double fractionalKnapsack(int weight[], int value[], int w) {
        double ratio[][] = new double[weight.length][2];
        // 0th column is store val index
        // 1th column is store ratio
        for (int i = 0; i < weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }

        // Sort in descending order of ratios
        Arrays.sort(ratio, Comparator.comparingDouble(o -> -o[1]));

        double result = 0;
        for (int i = 0; i < ratio.length; i++) {
            int idx = (int) ratio[i][0];
            if (w >= weight[idx]) {
                result += value[idx];
                w -= weight[idx];
            } else {
                result += ratio[i][1] * w;
                w = 0;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 3, W = 50;
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        System.out.println(fractionalKnapsack(weight, value, W));
    }
}
