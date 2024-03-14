package com.BinarySearch.Two_D_Array;

import java.util.Arrays;

public class Find_Peak_Element2 {
    public static int[] findPeakGrid(int[][] mat) {
        int max=Integer.MIN_VALUE;
        int row=-1;
        int col=-1;

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    row=i;
                    col=j;
                }
            }
        }
        int ans[]={row,col};
        return ans;
    }
    public static void main(String[] args) {
        int mat[][]={{1,4},{3,2}};
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
}
