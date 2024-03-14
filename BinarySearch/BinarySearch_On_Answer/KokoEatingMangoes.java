package com.BinarySearch.BinarySearch_On_Answer;

public class KokoEatingMangoes {
    public static int koko_eating_Bananas(int arr[],int h){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int si=1;
        int ei=max;
        while(si<ei){
            int mid=si+(ei-si)/2;
            if(check(arr,mid,h)){
                ei=mid;
            }
            else{
                si=mid+1;
            }
        }
        return si;
    }

    public static boolean check(int[] arr, int mid, int h) {
        int hour = 0;
        for (int num : arr) {
            if (mid != 0) {
                hour += num / mid;
                if (num % mid != 0) {
                    hour++;
                }
            }
        }
        if (hour <= h) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={312884470};
        int h=968709470;
        System.out.println(koko_eating_Bananas(arr,h));
    }
}
