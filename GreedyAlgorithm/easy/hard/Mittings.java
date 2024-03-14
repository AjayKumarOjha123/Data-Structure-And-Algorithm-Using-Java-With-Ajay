package com.GreedyAlgorithm.easy.hard;
import java.util.*;
public class Mittings {
    public static int maximumMeetings(int []start, int []end) {
        // Write your code here.
        int maxAct = 0;

        // For index Storing (If we need to look which activity selected)
        ArrayList<Integer> list = new ArrayList<>();

        int arr[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        // For Sort Basis On End Time
        Arrays.sort(arr, Comparator.comparingDouble(o -> o[2]));

        // select first activity
        maxAct = 1;
        list.add(arr[0][0]);
        int lasttime = arr[0][2];
        for (int i = 1; i < end.length; i++) {
            if (arr[i][1] > lasttime) {
                maxAct++;
                list.add(arr[i][0]);
                lasttime = arr[i][2];
            }
        }
        return maxAct;
    }
    public static void main(String[] args) {
       int N = 6;
       int start[] = {1,3,0,5,8,5};
       int end[] =  {2,4,6,7,9,9};
        System.out.println(maximumMeetings(start,end));
    }
}
