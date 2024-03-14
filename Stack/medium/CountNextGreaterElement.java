package com.Stack.medium;

import java.util.Arrays;

public class CountNextGreaterElement {
    public static int[] countGreater(int []arr, int []query) {
        // Write your code here.
        int ans[]=new int[query.length];
        int track=0;
        for(int i=0;i<query.length;i++){
            int count =0;
            for(int j=query[i];j<arr.length-1;j++) {
                if (arr[query[i]] < arr[j + 1]) {
                    count++;
                }
            }
            ans[track]=count;
            track++;
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,2,10,4};
        int q[]={0,1};
        countGreater(arr,q);
    }
}
