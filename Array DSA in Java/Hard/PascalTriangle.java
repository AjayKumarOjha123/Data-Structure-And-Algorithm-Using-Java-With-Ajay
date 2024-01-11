package com.Array.Hard;

import java.util.ArrayList;

public class PascalTriangle {
  public static ArrayList<ArrayList<Integer>> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Integer>>list=new ArrayList<>();
        if(n==0){
            return list;
        }
        ArrayList<Integer>temp=new ArrayList<>();
        temp.add(1);
        list.add(temp);
        for(int i=1;i<n;i++){
            ArrayList<Integer>curr=new ArrayList<>();
            curr.add(1);
            for(int j=0;j<list.get(i-1).size()-1;j++){
                ArrayList<Integer> data = list.get(i-1);
                curr.add(data.get(j)+data.get(j+1));
            }
            curr.add(1);
            list.add(curr);
        }
        return list;
  }
      public static void main(String[] args) {
      System.out.println(nthRowOfPascalTriangle(6));
    }
}
