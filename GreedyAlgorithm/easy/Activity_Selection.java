package com.GreedyAlgorithm.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity_Selection {

    //Agar End Time Sorted Ho Tab
    public static int activitySelection(int start[], int end[]) {
        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();

        //select first activity
        maxAct = 1;
        list.add(0);
        int lasttime = end[0];
        for (int i = 0; i < end.length; i++) {
            if (start[i] >= lasttime) {
                maxAct++;
                list.add(i);
                lasttime = end[i];
            }
        }
        return maxAct;
    }

        public static int activitySelection2(int start[], int end[]) {
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
                if (arr[i][1] >= lasttime) {
                    maxAct++;
                    list.add(arr[i][0]);
                    lasttime = arr[i][2];
                }
            }
            return maxAct;
        }

        public static void main(String[] args) {
            int start[] = {2, 1};
              int end[] = {2, 2};
            System.out.println(activitySelection(start, end));
            System.out.println(activitySelection2(start, end));
        }
    }
