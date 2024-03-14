package com.BinarySearch.BinarySearch_On_Answer;

public class Find_Nth_Root_Of_a_Number {

    //Brute Force Approach
    public static int find_Nth_Root_Of_a_Number(int n,int m){
        for(int i=1;i<=m;i++){
            int pow=(int)Math.pow(i,n);
            if(pow==m) {
                return i;
            }
            else if(pow>m){
                break;
            }
        }
        return -1;
    }

    //Optimal Using Binary Search
    public static int find_Nth_Root_Of_Number(int n,int m){
        int si=1;
        int ei=m;
        while(si<=ei){
            int mid=(si+ei)/2;
            int pow=(int)Math.pow(mid,n);
            if(pow==m){
                return mid;
            }
            else if(pow>m){
                ei=mid-1;
            }
            else {
                si=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //System.out.println(find_Nth_Root_Of_a_Number(2,9));
        System.out.println(find_Nth_Root_Of_Number(2,9));
    }
}
