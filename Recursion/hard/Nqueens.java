package com.Recursion.hard;
import java.util.*;
public class Nqueens {
    public static List<List<String>> solveNQueens(int n) {
        char queens[][]=new char[n][n];
        int row=n;
        int col=n;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                queens[i][j]='.';
            }
        }
        List<List<String>>list=new ArrayList<>();
        placeQueens(0,queens,n,list);
        return list;
    }

    private static void placeQueens(int row, char[][] queens, int n, List<List<String>> list) {
        if(row==n){
            List<String>temp=new ArrayList<>();
            for(int i=0;i<n;i++){
                String str="";
                for(int j=0;j<n;j++){
                    str+=queens[i][j];
                }
                temp.add(str);
            }
            list.add(temp);
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(queens,row,j)){
                queens[row][j]='Q';
                placeQueens(row+1,queens,n,list);
                queens[row][j]='.';
            }
        }

    }

    private static boolean isSafe(char[][] queens, int row, int col) {
        int n=queens.length;
        //check for row
        for(int j=0;j<n;j++){
            if(queens[row][j]=='Q')return false;
        }

        //check for col

        for(int i=0;i<n;i++){
            if(queens[i][col]=='Q')return false;
        }

        //for check (sought -> east) trangle
        int i=row;
        int j=col;
        while (i<n && j<n){
            if(queens[i][j]=='Q')return false;
            i++;
            j++;
        }

        //for check (north -> west) trangle
        i=row;
        j=col;
        while(i>=0 && j>=0){
            if(queens[i][j]=='Q')return false;
            i--;
            j--;
        }

       // for check (North -> east) trangle
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(queens[i][j]=='Q')return false;
            i--;
            j++;
        }

        // for check (Sought -> west) trangle

        i=row;
        j=col;
        while(i<n && j>=0){
            if(queens[i][j]=='Q')return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        int n=8;
        System.out.println(solveNQueens(n).size());
    }
}
