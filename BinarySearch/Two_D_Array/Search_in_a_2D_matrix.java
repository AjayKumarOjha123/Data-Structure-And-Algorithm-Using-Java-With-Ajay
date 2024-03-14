package com.BinarySearch.Two_D_Array;

public class Search_in_a_2D_matrix {

    //Brute Force Apporoach
    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    //Optimal Apporoach Using BinarySearch
    public static boolean searchMatrixBinarySearch(int[][] matrix, int target) {
        for(int a[] : matrix){
            if(search(a,target)){
                return true;
            }
        }
        return false;
    }
    public static boolean search(int[] a, int target) {
        int si=0;
        int ei=a.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(a[mid]==target){
                return true;
            }
            if(a[mid]<target){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
      int  matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, target = 3;
       // System.out.println(searchMatrix(matrix,3));
        System.out.println(searchMatrixBinarySearch(matrix,target));
    }
}
