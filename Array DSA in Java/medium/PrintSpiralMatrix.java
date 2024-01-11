package com.Array.medium;

import java.util.ArrayList;

public class PrintSpiralMatrix {

    //My Code Only For Printing.
    public static void printSpiralForm(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int top = 0;
        int left = 0;
        int right = col - 1;
        int bootom = row - 1;
        while (top<=bootom && left<=right) {
            //For Top Row Printing
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            //For Right
            for (int i = top; i <= bootom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if(top <= bootom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bootom][i] + " ");
                }
                bootom--;
            }
            if (left <= right) {
                for (int i = bootom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    //GFG Submission Code
    public static ArrayList<Integer> printSpiralMatrix(int arr[][], int r,int c){
        ArrayList<Integer> list=new ArrayList<>();
        int top=0;
        int bootom=r-1;
        int left=0;
        int right=c-1;
        // For Row Printing
        while(left<=right && top<=bootom){
            for(int i=left;i<=right;i++){
                list.add(arr[top][i]);
            }
            top++;

            //For Right Printing
            for(int i=top;i<=bootom;i++){
                list.add(arr[i][right]);
            }
            right--;

            //For Bootom Printing
            if(top<=bootom){
                for(int i=right;i>=left;i--){
                    list.add(arr[bootom][i]);
                }
                bootom--;
            }
            //For Left Printing
            if(left<=right){
                for(int i=bootom;i>=top;i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }
       return list;
    }
    public static void main(String[] args) {
        int arr[][]={{1,    2,   3,   4},
            {5,    6,   7,   8},
            {9,   10,  11,  12},
            {13,  14,  15,  16 }};

        printSpiralForm(arr);
        System.out.println();
        System.out.println( printSpiralMatrix(arr,arr.length,arr[0].length));
    }
}
