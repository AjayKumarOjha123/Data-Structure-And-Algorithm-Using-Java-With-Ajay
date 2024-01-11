package com.Array.easy;

import java.awt.color.ICC_ColorSpace;
import java.util.Arrays;

public class Move0toEnd {

    public static void move0toEnd(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            while(arr[i]!=0){
                i++;
            }
            while(arr[j]==0){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,0,3,0,0,2,5,1,0,7,8};
        move0toEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
