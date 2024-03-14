package com.GreedyAlgorithm.easy.hard;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public  class insert_interval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length==0){
            int arr[][]=new int [1][2];
            arr[0]=newInterval;
            return arr;
        }
        boolean flag = false;
        int[][] newarray = new int[intervals.length + 1][intervals[0].length];
        for (int i = 0; i < intervals.length; i++) {
            int[] arr = intervals[i];
            if (!flag && arr[0] >= newInterval[0]) {
                for (int j = intervals.length - 1; j >= i; j--) {
                    newarray[j + 1] = intervals[j];
                }
                newarray[i] = newInterval;
                flag = true;
                break;
            }
            newarray[i] = arr;
        }
        if (!flag) {
            newarray[intervals.length] = newInterval;
        }
        return merge(newarray);
    }

    public static int[][] merge(int[][] arr) {
        int n = arr.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        int[][] answer = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            ArrayList<Integer> curr = ans.get(i);
            answer[i][0] = curr.get(0);
            answer[i][1] = curr.get(1);
        }
        return answer;
    }
    public static void main(String[] args) {
       int intervals[][] = {{1,3},{6,9}}, newInterval[] = {2,5};
       for(int arr[] : insert(intervals,newInterval)){
           System.out.print(Arrays.toString(arr));
       }
        System.out.println();
    }
}
