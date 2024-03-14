package com.SlidingWindow_And_TwoPointer.medium;
import java.util.*;
public class Fruit_into_Basket {

    //Brute Force Apporoach
    public static int fruits(int arr[]){
        int n=arr.length;
        int left=0;
        int right=0;
        int basket=1;
        int max=Integer.MIN_VALUE;

        while(right<n){
            if(arr[left]!=arr[right]){
                basket++;
            }
            while(basket>2){
                if(arr[left]!=arr[right]){
                    basket--;
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

    //Optimal Apporoach
    public static int findMaxFruits(int[] fruits, int n) {
        HashMap<Integer,Integer>map=new HashMap<>();
        // int n=fruits.length;
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while(right<n){
            if(map.containsKey(fruits[right])){
                map.put(fruits[right],map.get(fruits[right])+1);
            }
            else{
                map.put(fruits[right],1);
            }

            while(map.size()>2){
                int val=map.get(fruits[left]);
                if(val-1==0){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left], val - 1);
                }
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1 ,2 ,3 ,4};
        System.out.println(fruits(arr));
    }
}
