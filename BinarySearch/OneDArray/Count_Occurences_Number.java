package com.BinarySearch.OneDArray;
public class Count_Occurences_Number {

    //Brute Force Apporoach
    public static int count_Number_Occurences(int arr[],int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }

    //Optimal Apporoach
    public static int number_Of_Occurences(int arr[],int x){
        //For First Occurence
        int si=0;
        int ei=arr.length-1;
        int first=-1;
        int last=-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==x){
                first=mid;
                ei=mid-1;
            }
            if(arr[mid]<x){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        //For Last Occurence
        si=0;
        ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]==x){
                last=mid;
                si=mid+1;
            }
            if(arr[mid]>x){
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        if(last==-1 && first==-1){
            return 0;
        }
        return (last-first)+1;
    }
    public static void main(String[] args) {
      int arr[] = {1, 1, 2, 2, 2, 2, 3};
      int x=4;
        //System.out.println(count_Number_Occurences(arr,x));
        System.out.println(number_Of_Occurences(arr,x));
    }
}
