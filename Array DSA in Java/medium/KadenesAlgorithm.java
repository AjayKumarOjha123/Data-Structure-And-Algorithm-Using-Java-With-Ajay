package com.Array.medium;

public class KadenesAlgorithm {
    public static int kadenesAlgorithm(int arr[]){
        int ms=0;
        int cs=0;
        int small= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms,cs);
        }
        if(ms==0){
            for(int j=0;j<arr.length;j++){
                if(arr[j]>small){
                    small=arr[j];
                }
            }
            return small;
        }
        return ms;
    }
    public static void main(String[] args) {
        int arr[]={-10, -2, -3, -4};
        System.out.println(kadenesAlgorithm(arr));
    }
}
