package com.Recursion.hard;

public class WordSearch {

    public static boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0) && find(board,i,j,0,word)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean find(char board[][],int i,int j,int idx,String word){
        if(idx==word.length()){
            return true;
        }

        if(i==-1 || i==board.length || j==-1 || j==board[0].length ||board[i][j]!=word.charAt(idx)){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='#';

        boolean found= find(board,i+1,j,idx+1,word) ||find(board,i-1,j,idx+1,word)||find(board,i,j+1,idx+1,word) || find(board,i,j-1,idx+1,word);
        board[i][j]=temp;
        return found;
    }
    public static void main(String[] args) {
       char [][] board = {{'A','B','C','E'},
                           {'S','F','C','S'},
                           {'A','D','A','E'}};
        String word = "SEE";
        System.out.println(exist(board,word));

    }
}
