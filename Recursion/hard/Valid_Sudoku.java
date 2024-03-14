package com.Recursion.hard;
import java.util.*;
public class Valid_Sudoku {

    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                char num=board[i][j];
                board[i][j]='.';
                if(valid(board,i,j,num)==false){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean valid(char[][] board, int row, int col, char num) {
        //Check For Row
        for(int j=0;j<9;j++){
            if(board[row][j]==num)return false;
        }

        //Check For Col
        for(int i=0;i<9;i++){
            if(board[i][col]==num)return false;
        }

        //Check For 3*3 grid

        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==num)return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '6', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }
}
