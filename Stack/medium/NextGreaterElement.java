package com.Stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int ans[]=new int[n];
        Stack<Integer>s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            NGE(arr,i,s,ans);
        }
        return ans;
    }

    private static void NGE(int[] arr, int i, Stack<Integer> s, int[] ans) {
        while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
            s.pop();
        }
        if(s.isEmpty()){
            ans[i]=-1;
        }
        else{
            int idx=s.peek();
            ans[i]=arr[idx];
        }
        s.push(i);
    }

    public static void main(String[] args) {
        int arr[] = {7, 12, 1, 20};
        int ans[]=nextGreaterElement(arr,arr.length);
        System.out.println(Arrays.toString(ans));
    }
}
