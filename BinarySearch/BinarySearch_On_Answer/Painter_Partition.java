package com.BinarySearch.BinarySearch_On_Answer;
import java.util.*;
public class Painter_Partition {

    public static int painter_Partition(ArrayList<Integer> boards, int k)
    {
        int n=boards.size();
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(max, boards.get(i));
            sum+=boards.get(i);
        }
        for(int i=max;i<=sum;i++){
            if(partition(boards,i)==k){
                return i;
            }
        }
        return max;
    }

    public static int partition(ArrayList<Integer>arr,int max){
        int load=0; int painterCount=1;
        for(int i=0;i<arr.size();i++){
            if(load+arr.get(i)<=max){
                load+=arr.get(i);
            }
            else{
                painterCount++;
                load=arr.get(i);
            }
        }
        return painterCount;
    }

    //Optimal Apporoach Using BS
    static long painter_PartitionBinarySearch(int[] arr,int n,int k){
        long sum=0;
        long max=0;
        for(int num : arr){
            sum+=num;
            max=Math.max(num,max);
        }
        if(n==k){
            return max;
        }
        long ans=max;
        long si=max;
        long ei=sum;
        while(si<=ei){
            long mid=(si+ei)/2;
            if(isPossible(arr,mid,k)){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int arr[],long mid,int k){
        int painter=1;long sum=0;
        for(int num : arr){
            sum+=num;
            if(sum>mid){
                painter++;
                sum=num;
            }
        }
        return painter<=k;
    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>(); int k=2;
        arr.add(2);
        arr.add(1);
        arr.add(5);
        arr.add(6);
        arr.add(2);
        arr.add(3);

        int array[]={2,1,5,6,2,3};
        System.out.println(painter_Partition(arr,k));
        System.out.println(painter_PartitionBinarySearch(array,array.length,k));
    }
}
