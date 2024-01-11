package com.Array.easy;

public class SecondLargestElement {

    public static int secondlargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                secondlargest=max;
                max=arr[i];
            }
            else if(arr[i]!=max && secondlargest<arr[i]){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }

    public static void main(String[] args) {
        int arr[]={330,4,999,120,330,34,56,999,67,330,1,999,3};
        System.out.println(secondlargest(arr));
    }
}
