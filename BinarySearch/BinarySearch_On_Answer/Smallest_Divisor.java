package com.BinarySearch.BinarySearch_On_Answer;

public class Smallest_Divisor {

    //Brute Force Apporoach
    public static int smallest_Divisor(int arr[],int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
       for(int i=1;i<=max;i++){
           int sum=0;
           for(int j=0;j<arr.length;j++){
               sum+=Math.ceil((double) arr[j]/(double) i);
           }
           if(sum<=k){
               return i;
           }
       }
       return -1;
    }
//Optimal Apporoach
    public static int smallestDivisor(int arr[],int k){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int si=1;
        int ei=max;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(possible(arr,mid)<=k){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return si;
    }
    public static int possible(int[] arr, int mid) {
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=Math.ceil((double) arr[j]/(double) mid);
        }
       return sum;
    }

    public static void main(String[] args) {
     int   A[] ={1 ,2 ,5, 9};
     int k= 6;
       // System.out.println(smallest_Divisor(A,k));
        System.out.println(smallestDivisor(A,k));
    }
}
