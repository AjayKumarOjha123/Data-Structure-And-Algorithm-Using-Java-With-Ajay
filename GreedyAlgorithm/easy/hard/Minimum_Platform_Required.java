package com.GreedyAlgorithm.easy.hard;

import java.util.Arrays;

public class Minimum_Platform_Required {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        Arrays.sort(at);
        Arrays.sort(dt);
        int i=1;
        int j=0;
        int minPlatform=1;

        while(i<at.length){
            if(at[i]<=dt[j]){
                minPlatform++;
            }
            else{
                j++;
            }
            i++;
        }

        return minPlatform;

    }
    public static void main(String[] args) {
      int  arr[] = {900, 940, 950, 1100, 1500, 1800};
      int  dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(calculateMinPatforms(arr,dep,dep.length));
    }
}
