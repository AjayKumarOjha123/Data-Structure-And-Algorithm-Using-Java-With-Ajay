package com.BinarySearch.BinarySearch_On_Answer;

public class Squre_Root_Of_a_Number {

    //Using Java inbuilt Function
    public static int squre(int num){
        int squre=(int)Math.sqrt(num);
        return squre;
    }

    //Brute Force Apporoach
    public static int squreRoot(int num){
        int ans=1;
        for(int i=1;i<=num/2;i++){
            if(i*i<=num){
                ans=i;
            }
            else {
                break;
            }
        }
        return ans;
    }

    //Optimal Apporoach Using Binary Search
    public static int squre_Root(int num){
        int ans=1;
        int si=1;
        int ei=num;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(mid*mid<=num){
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
       // System.out.println(squre(25));
       // System.out.println(squreRoot(25));
        System.out.println(squre_Root(25));
    }
}
