package com.BinarySearch.BinarySearch_On_Answer;
import java.util.*;
public class Median_of_2_sorted_arrays {

    //Brute Force Apporoach
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            list.add(nums2[i]);
        }
        Collections.sort(list);
        int n1=nums1.length; int n2=nums2.length;
        int n=n1+n2;
        if(n%2==1){
            return (double)list.get(n/2);
        }
            double median = ((double) list.get(n / 2) + (double) list.get((n / 2) - 1)) / 2.0;
             return median;
    }
    public static void main(String[] args) {
      int  nums1[] = {1,3}; int nums2[] = {2};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}
