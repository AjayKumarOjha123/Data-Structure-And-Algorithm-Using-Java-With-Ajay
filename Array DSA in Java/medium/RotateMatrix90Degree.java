package com.Array.medium;

public class RotateMatrix90Degree {

    static void rotateby90(int matrix[][], int n)
    {
        //For Transpose Of Matrix
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       // Rotate (90*)
        for(int i=0;i<n/2;i++){
            for(int j=0;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-i][j];
                matrix[n-1-i][j]=temp;
            }
        }
    }
    public static void main(String[] args) {
       int  matrix[][] ={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
       rotateby90(matrix,matrix.length);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
