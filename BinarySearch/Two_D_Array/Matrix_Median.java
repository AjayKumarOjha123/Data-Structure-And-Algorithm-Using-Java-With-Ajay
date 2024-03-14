package com.BinarySearch.Two_D_Array;
import java.util.*;
public class Matrix_Median {
    //Brute Force Apporoach
  public  static   int median(int matrix[][], int R, int C) {
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < R; i++) {
          for (int j = 0; j < C; j++) {
              list.add(matrix[i][j]);
          }
      }
      Collections.sort(list);
      int si = 0, ei = list.size() - 1;
      int mid = (si + ei) / 2;
      return list.get(mid);
  }

  //Optimal Apporoach Using Binary Search
  public  static  int medianUsingBinarySearch(int A[][], int row, int col) {
          int low = 1;
          int high = Integer.MAX_VALUE;
          int n = row;
          int m = col;
          while (low <= high) {
              int mid = (low + high) >> 1;
              int cnt = 0;
              for (int i = 0; i < n; i++) {
                  cnt += countSmallerThanMid(A[i], mid, col);
              }
              if (cnt <= (n * m) / 2)
                  low = mid + 1;
              else
                  high = mid - 1;
          }
          return low;
  }
    public static int countSmallerThanMid(int[] A, int mid, int n) {
        int l = 0, h = n - 1;
        while (l <= h) {
            int md = (l + h) >> 1;
            if (A[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }
      public static void main (String[]args){

        }
    }

