package com.Array.medium;

import java.util.Arrays;

public class Sortanarrayof0s1sand2s {

    public static void sortanarrayof0s1sand2s(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else if(arr[i]==2){
                count2++;
            }
        }
        for(int z=0;z<count0;z++){
            arr[z]=0;
        }
        for(int j=count0;j<count0+count1;j++){
            arr[j]=1;
        }
        for(int k=(count0+count1);k<arr.length;k++){
            arr[k]=2;
        }
    }
    public static void main(String[] args) {
        int arr[]={0, 1, 2, 0, 1, 2};
        sortanarrayof0s1sand2s(arr);
        System.out.println(Arrays.toString(arr));
    }
}
