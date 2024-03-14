package com.Stack.medium;

public class TraipingRainWater {
    public static int trap(int[] height) {
       int n=height.length;
       int leftmax[]=new int[n];
       int rightmax[]=new int[n];
       int totWater=0;
       //For Calculate All Left Maximum
       int max=0;
       for(int i=0;i<n;i++){
           max=Math.max(max,height[i]);
           leftmax[i]=max;
       }
       //For Calculating Right Max.
       max=0;
       for(int i=n-1;i>=0;i--){
           max=Math.max(max,height[i]);
           rightmax[i]=max;
       }

       //Calculate Rain Using Formula
        // leftMax,Rightmax (Min).
        //minus current height;
        for(int i=0;i<n;i++){
            int water=Math.min(leftmax[i],rightmax[i])-height[i];
            totWater+=water;
        }
        return totWater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        System.out.println(trap(arr));
    }
}
