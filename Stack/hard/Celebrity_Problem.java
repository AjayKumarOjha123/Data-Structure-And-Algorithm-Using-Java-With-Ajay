package com.Stack.hard;

import java.util.Stack;

public class Celebrity_Problem {
    public static int celebrity(int m[][],int n){
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<n;i++){
           s.push(i);
        }
        while(s.size()>1){
            int v1=s.pop();
            int v2=s.pop();
            if(m[v1][v2]==0){
                s.push(v1);
            }
            else if(m[v2][v1]==0){
                s.push(v2);
            }
        }
        if(s.isEmpty())return -1;
        int celeb=s.pop();
        //check row
        for(int j=0;j<n;j++){
            if(m[celeb][j]==1)return -1;
        }
        //check column
        for(int i=0;i<n;i++) {
            if(i==celeb)continue;
            if (m[i][celeb] == 0) return -1;
        }
        return celeb;
    }
    public static void main(String[] args) {
      int  N = 3;
      int   M[][] = {{0, 1, 0},
                    {0, 0 ,0},
                    {0 ,1 ,0}};
        System.out.println(celebrity(M,N));
    }
}
