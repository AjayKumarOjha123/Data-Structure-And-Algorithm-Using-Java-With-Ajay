package com.BinarySearch.BinarySearch_On_Answer;

public class Capacity_to_Ship_Packages_within_Days {
    public static int capacity_to_Ship_Packages_within_Days(int weights[], int day) {
        int maxi = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        for (int i = maxi; i <= sum; i++) {
            if (findDays(weights, i) <= day) {
                return i;
            }
        }
        return -1;
    }
    public static int findDays(int[] weights, int cap) {
        int days = 1;
        int load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days += 1; //move to next day
                load = weights[i]; //load the weight.
            } else {
                //load the weight on the same day.
                load += weights[i];
            }
        }
        return days;
    }
    public static int capacity_toShip_Packages_within_Days(int weights[], int day) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int si=max;
        int ei=sum;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(findDays(weights,mid)<=day){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
       return si;
    }

        public static void main(String[] args) {
        int arr[] = {9, 8, 10};
        int day = 3;
            System.out.println(capacity_toShip_Packages_within_Days(arr,day));
        }
}
