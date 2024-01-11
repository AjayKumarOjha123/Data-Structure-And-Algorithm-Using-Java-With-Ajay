package com.Array.Hard;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeTwoSortedArray(int arr1[],int arr2[],int n,int m){

        //Brute Force Apporoach

        int arr3[]=new int[n+m];
        int left=0;
        int right=0;
        int x=0;
        while(left<n && right<m){
            if(arr1[left]<arr2[right]){
                arr3[x]=arr1[left];
                x++;left++;
            }
            else{
                arr3[x]=arr2[right];
                x++;right++;
            }
        }
        while(left<n){
            arr3[x]=arr1[left];
            x++;left++;
        }
        while(right<m){
            arr3[x]=arr2[right];
            x++;right++;
        }
        return arr3;
    }

    //Optimal Apporoach
    public static void mergeSortedArray(int arr1[],int arr2[],int n,int m){
        int i=n-1;
        int j=0;
        while(i>=0 && j<m){
            if(arr2[j]<arr1[i]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                j++;
                i--;

            }else {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
     int    n = 4, arr1[] = {1 ,3 ,5 ,7};
     int    m = 5, arr2[] = {0 ,2 ,6 ,8, 9};
//     int res[]=mergeTwoSortedArray(arr1,arr2,n,m);
//        System.out.println(Arrays.toString(res));
      mergeSortedArray(arr1,arr2,n,m);
        System.out.print(Arrays.toString(arr1)+" ");
        System.out.print(Arrays.toString(arr2)+" ");

    }
}
