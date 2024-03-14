package com.Heaps.hard;
import java.util.*;
public class Maximum_Sum_Combination {
    public static int[] kMaxSumCombination(int []a, int []b, int n, int k){
        // Write your code here.
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());
        int res[]=new int[k];
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<b.length;j++){
                sum=a[i]+b[j];
                pq.add(sum);
            }
        }
        int x=0;
        while(x<k){
            res[x++]=pq.remove();
        }

        return res;
    }

    public static void main(String[] args) {
        int arr1[]={1, 3};
        int arr2[]={4,2};
        int k=2;
        System.out.println(Arrays.toString(kMaxSumCombination(arr1,arr2,arr2.length,k)));
    }
}
