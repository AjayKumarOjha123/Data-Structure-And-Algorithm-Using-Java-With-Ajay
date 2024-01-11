package com.Array.medium;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes {
    public static  void setmatrixMINUS1(int[][] matrix,int r, int c){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(i==r || j==c){
                   matrix[i][j]=-1;
                }
            }
        }
    }
    public static void setZeroes(int[][] matrix) {

        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j]==0){
                  setmatrixMINUS1(matrix,i,j);
               }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
        //For Row Only

        //For Column Only
//        for(int j=0;j<y.size();j++){
//            int idx=y.get(j);
//            for(int i=0;i<n;i++){
//                matrix[i][idx]=0;
//            }
//        }
    }
    public static void main(String[] args) {
        int  matrix[][] ={{1,1,1},{1,0,1},{0,1,1}};
        setZeroes(matrix);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
