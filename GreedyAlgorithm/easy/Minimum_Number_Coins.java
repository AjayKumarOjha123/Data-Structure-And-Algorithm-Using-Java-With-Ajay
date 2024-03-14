package com.GreedyAlgorithm.easy;

import java.util.Arrays;

public class Minimum_Number_Coins {
    public static int minCoins(int coins[], int M, int V)
    {
        Arrays.sort(coins);
        int count=0;
        int i=M-1;
        while(i>=0){
            if(coins[i]>V){
                i--;
            }
            else{
                V-=coins[i];
                count++;
                if(V==0){
                    return count;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     int   V = 33, M = 4;int coins[] = {25, 10, 5,3};
        System.out.println(minCoins(coins,M,V));
    }
}
