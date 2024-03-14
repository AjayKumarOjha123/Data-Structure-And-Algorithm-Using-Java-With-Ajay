package com.BinarySearch.BinarySearch_On_Answer;

public class Minimum_days_to_make_M_bouquets {
    public static int minimum_days_to_make_M_bouquets(int arr[],int m,int k){
        //Where arr=bloomDay || m=Total Number of bouquets || k = adjecent Flawers
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           min=Math.min(min,arr[i]);
           max=Math.max(max,arr[i]);
        }
        int val = m * k;
        int n = arr.length; // Size of the array
        if (val > n) return -1; // Impossible case.
        for (int i = min; i <= max; i++) {
            if (possible(arr, i, m, k))
                return i;
        }
        return -1;
    }
    public static boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; // Size of the array
        int cnt = 0;
        int noOfB = 0;
        // Count the number of bouquets:
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else{
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
    public static int minimum_days_to_make_M_bouquet(int arr[],int m,int k){
        int n=arr.length;
        long val = (long) m * k;
        if(n<val){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int si=min;
        int ei=max;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(possible(arr,mid,m,k)){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return si;
    }

       public static void main(String[] args) {
      int  M = 2, K = 3;
      int  bloomDay[] = {5, 5, 5, 5, 10, 5, 5};
      System.out.println(minimum_days_to_make_M_bouquet(bloomDay,M,K));
    }
}
