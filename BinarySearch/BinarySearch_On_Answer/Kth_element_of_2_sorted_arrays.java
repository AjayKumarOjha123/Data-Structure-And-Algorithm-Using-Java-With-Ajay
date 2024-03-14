package com.BinarySearch.BinarySearch_On_Answer;

import java.util.ArrayList;
import java.util.Collections;

public class Kth_element_of_2_sorted_arrays {
    public static int kth_element_of_2_sorted_arrays(int arr1[],int arr2[],int k){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        Collections.sort(list);
        int count=1;
        for(int a : list){
            if(count==k){
                return a;
            }
            count++;
        }
        return -1;
    }
    public static void main(String[] args) {
     int   arr1[] = {100, 112, 349, 770};
     int  arr2[] = {72, 86, 113, 119, 265, 445, 892};
     int k=7;
     System.out.println(kth_element_of_2_sorted_arrays(arr1,arr2,k));

    }
}
