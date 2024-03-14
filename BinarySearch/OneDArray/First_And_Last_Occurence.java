package com.BinarySearch.OneDArray;

import java.util.Arrays;

public class First_And_Last_Occurence {

    //Brute Force Apporoach
    public static int[] firstAndLastOccurence(int arr[],int x){
        int first=-1;
        int last=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }

        }
        int ans[]={first,last};
        return ans;
    }

    //Optimal Apporoach
    public static int [] find_First_Last_Occurence(int arr[],int x){
       int si=0;
       int ei=arr.length-1;
       int first=-1;
       int last=-1;
       while(si<=ei){
           int mid=(si+ei)/2;
           if(arr[mid]==x){
               first=mid;
               ei=mid-1;
           }
           if(arr[mid]<x){
               si=mid+1;
           }
           else{
               ei=mid-1;
           }
       }
       si=0;
       ei=arr.length-1;
       while(si<=ei){
           int mid=(si+ei)/2;
           if(arr[mid]==x){
               last=mid;
               si=mid+1;
           }
           if(arr[mid]>x){
               ei=mid-1;
           }
           else{
               si=mid+1;
           }
       }
       int ans[]={first,last};
       return ans;
    }

    public static void main(String[] args) {
      int [] arr= { 0,1,1,1,5};
      int k=5;
        System.out.println(Arrays.toString(firstAndLastOccurence(arr,k)));
        System.out.println(Arrays.toString(find_First_Last_Occurence(arr,k)));

    }
}
