package com.BinarySearch.BinarySearch_On_Answer;
import java.util.*;
public class Aggeresive_Cow {

    //Brute Force Apporoach
        public static int aggeresive_Cow(int n, int k, int[] stalls) {
            Arrays.sort(stalls);
            int si=0;
            int ei=stalls[n-1];
            int ans=0;
            for(int i=1;i<=ei;i++){
                if(isPossible(stalls,i,k)){
                    ans=i;
                }
                else{
                    break;
                }
            }
            return ans;
        }
        public static boolean isPossible (int stalls[],int i,int k) {
            int cow=1;
            int placedPos=stalls[0];
            for(int num : stalls){
                if(num-placedPos>=i){
                    cow++;
                    placedPos=num;
                }
            }
            return cow>=k;
        }

        //Optimal Apporoach Using BS.
        public static int aggeresive_Cow_Using_BinarySearch(int n, int k, int[] stalls) {
            Arrays.sort(stalls);
            int si=0;
            int ei=stalls[n-1];
            int ans=0;
            while(si<=ei){
                int mid=(si+ei)/2;
                if(isPossible(stalls,mid,k)){
                    ans=mid;
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
        int  n=5;
        int  k=3;
        int stalls[] = {1 ,2, 4, 8, 9};

        System.out.println(aggeresive_Cow(n,k,stalls));
        System.out.println(aggeresive_Cow_Using_BinarySearch(n,k,stalls));
    }
}
