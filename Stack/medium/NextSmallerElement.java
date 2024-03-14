package com.Stack.medium;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    public static void immediateSmaller(int []a) {
        // Write your code here.
        int ans[]=new int[a.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=a.length-1;i>=0;i--) {
            NSE(a, i, stack, ans);
        }
        for(int i=0;i<ans.length;i++){
            a[i]=ans[i];
        }
        System.out.println(Arrays.toString(a));
    }

    private static void NSE(int[] a, int i, Stack<Integer> stack, int[] ans) {
        if(stack.isEmpty()){
            ans[i]=-1;
        }
        else{
            if(a[stack.peek()]<a[i]){
                ans[i]=a[stack.peek()];
            }
            else{
                ans[i]=-1;
            }
        }
        stack.push(i);
    }

    public static void main(String[] args) {
      int  a[] = {4, 7, 8, 2, 3, 1};
        immediateSmaller(a);
    }
}
