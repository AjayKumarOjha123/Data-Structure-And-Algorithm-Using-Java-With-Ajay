package com.Array.Hard;

import java.util.Arrays;

public class MissingAndRepeatingNumber {

    //Brute Force Apporoach
    public static int[]  repeatAndMissing(int arr[],int n){
        int ans[]=new int[2];
        int repeat=0;
        int missing=0;

        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    count++;
                }
            }
            if(count==2){
                repeat=i;
            }
            else if(count==0){
                missing=i;
            }
        }
        ans[0]=repeat;
        ans[1]=missing;
        return ans;
    }

    //Better Approach

    public static int [] missingAndrepeating(int arr[],int n){
        int temp[]=new int[n+1];
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            temp[arr[i]]+=1;
        }
        int repeat=-1,missing=-1;
        for(int i=1;i<=n;i++){
            if(temp[i]==2){
                repeat=i;
            }
            else if(temp[i]==0){
                missing=i;
            }
            if(repeat!=-1 && missing!=-1){
                break;
            }
        }
        ans[0]=repeat;
        ans[1]=missing;
        return ans;
    }
    public static void main(String[] args) {
      int  N = 2;
      int Arr[] = {2, 2};
     //int ans[]=  repeatAndMissing(Arr,N);
       // System.out.println(Arrays.toString(ans));
        int ans[]=missingAndrepeating(Arr,N);
        System.out.println(Arrays.toString(ans));

    }
}
