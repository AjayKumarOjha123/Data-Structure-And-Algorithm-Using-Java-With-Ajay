package com.Array.easy;

import java.util.HashSet;

public class FindUnion {

    public static void findUnion(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.print("Union = ");
        System.out.println(set);
    }

    public static void main(String[] args) {
        int arr1[]={2,3,1,5,2,3,4};
        int arr2[]={7,4,3,5,2,1,8};
        findUnion(arr1,arr2);
    }
}
