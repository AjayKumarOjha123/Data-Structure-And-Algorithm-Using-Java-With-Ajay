package com.GreedyAlgorithm.easy.hard;

import java.util.Arrays;
import java.util.Comparator;

public class Non_Overlapping_intervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        int i=0;
        int j=1;
        int count=0;
        while(j<n){
            int curr[]=intervals[i];
            int next[]=intervals[j];
            //curr
            int cs=curr[0];
            int ce=curr[1];
            //next
            int ns=next[0];
            int ne=next[1];

            if(ce<=ns){//overlapping nhi ho raha
                i=j;
                j++;
            }
            //overlapping ho raha hai
            else if(ce<=ne){
                j++;
                count++;
            }
            else if(ce>ne){
                i=j;
                j++;
                count++;
            }

        }
      return count;
    }
    public static void main(String[] args) {
       int intervals[][] = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
