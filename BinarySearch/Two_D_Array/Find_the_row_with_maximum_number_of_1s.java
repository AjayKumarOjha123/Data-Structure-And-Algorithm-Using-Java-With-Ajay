package com.BinarySearch.Two_D_Array;
import java.util.*;
public class Find_the_row_with_maximum_number_of_1s {

    public static int maximumOnesRow(List<List<Integer>> matrix)
    {
        //	  Write your code here.
        int max=Integer.MIN_VALUE;
        int sp=0;
        int c=-1;
        for(List<Integer>temp : matrix){
            int count=0;
            c++;
            for(int i : temp){
                if(i==1){
                    count++;
                }
            }
            if(count>max){
                max=count;
                sp=c;
            }
        }
        return sp;
    }

    //Optimal Apporoach
    public static int maximumOnesRowBinarySearch(int [][]matrix)
    {
        int max=0;
        int sp=0;
        int c=-1;
        for(int temp[] : matrix){
            int maximum=temp.length-findmaxones(temp);
            c++;
            if(maximum>max){
                max=maximum;
                sp=c;
            }
        }
        return sp;
    }

    public static int findmaxones(int []temp) {
        int ans=0;
        int si=0;
        int ei=temp.length-1;
        while(si<=ei){
            int mid =(si+ei)/2;
            if(temp[mid]>=1){
                ans=mid;
                ei=mid-1;
            }
            else{
                si=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
      int matrix[][]= {{0 ,0 ,1},
                      { 0 ,1 ,1},
                      {1 ,1 ,1},
                      { 0 ,1 ,1},
                      {0 ,0 ,1},
                      {0 ,1 ,1},
                      { 0 ,0 ,1},
                      {0 ,0 ,0},
                      {1 ,1 ,1}};
       // List<List<Integer>>arr=List.of(List.of(1, 1),List.of( 1 ,1));
       //int ans= maximumOnesRow(arr);
      //  System.out.println(ans);
        System.out.println(maximumOnesRowBinarySearch(matrix));
    }
}









