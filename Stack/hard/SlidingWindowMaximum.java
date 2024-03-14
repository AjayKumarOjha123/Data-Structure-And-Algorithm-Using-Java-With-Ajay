package com.Stack.hard;

import java.util.Arrays;
import java.util.Stack;

public class SlidingWindowMaximum {

    //Brute Force Apporoach
    public static void slidingWindow(int arr[],int k){
        int n=arr.length;
        int ans[]=new int [n-k+1];
        int x=0;
        for(int i=0;i<n-k+1;i++){
            int max=Integer.MIN_VALUE;
            for(int j=i;j<i+k;j++){
                max=Math.max(max,arr[j]);
            }
            ans[x++]=max;
        }
        System.out.println(Arrays.toString(ans));
    }

    //Better Apporoach

    public static void slidingWindowMaximum(int arr[],int k){
        int n=arr.length;
        int NGE[]=new int[n];
        int ans[]=new int[n-k+1];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NGE[i]=n;
            }
            else{
                NGE[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<n-k+1;i++){
            int j=i;
            int max=Integer.MIN_VALUE;
            while(j<i+k){
                max=arr[j];
                j=NGE[j];
            }
            ans[i]=max;
        }
        System.out.println(Arrays.toString(ans));
    }

    //Optimal Apporoach

    public static void slidingWindowMax(int arr[],int k){
        int n=arr.length;
        int NGE[]=new int[n];
        int ans[]=new int[n-k+1];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                NGE[i]=n;
            }
            else{
                NGE[i]=s.peek();
            }
            s.push(i);
        }
        int j=0;
        for(int i=0;i<n-k+1;i++){
           if(j>=i+k)j=i;
            int max=Integer.MIN_VALUE;
            while(j<i+k){
                max=arr[j];
                j=NGE[j];
            }
            ans[i]=max;
        }
        System.out.println(Arrays.toString(ans));
    }

    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        //slidingWindow(arr,k);
       // slidingWindowMaximum(arr,k);
        slidingWindowMax(arr,k);
    }
}
