package com.Recursion.hard;
import java.util.*;
public class Rat_in_Maze {
    public static ArrayList<String> findPath(int[][] m, int n) {
       int er=n-1;
       int ec=m[0].length-1;
       ArrayList<String>ans=new ArrayList<>();
       isPossible(0,0,m,er,ec,ans,"");
       return ans;
    }

    private static void isPossible(int sr, int sc, int[][] m, int er,int ec, ArrayList<String> ans, String s) {
        if(sr<0 || sc<0)return;
        if(sr>er || sc>ec)return;
        if(sr==er && sc==ec){
            ans.add(s);
            return;
        }
        if(m[sr][sc]==0)return;
        if(m[sr][sc]==-1)return;

        m[sr][sc]=-1;

        //Go Right
        isPossible(sr,sc+1,m,er,ec,ans,s+"R");
        //Go Left
        isPossible(sr,sc-1,m,er,ec,ans,s+"L");
        //Go Up
        isPossible(sr-1,sc,m,er,ec,ans,s+"U");
        //Go Bottom/Down
        isPossible(sr+1,sc,m,er,ec,ans,s+"D");

        //BackTracking
        m[sr][sc]=1;
    }

    public static void main(String[] args) {
       int  N = 4;
       int  m[][] = {{1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {1, 1, 0, 0},
                    {0, 1, 1, 1}};
        System.out.println(findPath(m,N));
    }
}
