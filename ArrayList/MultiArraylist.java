package com.ArrayList;

import java.util.ArrayList;

public class MultiArraylist {

    // Print Function

    public static void print(ArrayList<ArrayList<Integer>>mainlist){
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer>curlist=mainlist.get(i);
            for(int j=0;j<curlist.size();j++){
                System.out.print(curlist.get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        ArrayList<Integer>l3=new ArrayList<>();

        for(int i=1;i<=5;i++){
            l1.add(1*i);// 1 2 3 4 5
            l2.add(2*i);// 2 4 6 8 10
            l3.add(3*i);// 3 6 9 12 15
        }

        mainlist.add(l1);
        mainlist.add(l2);
        mainlist.add(l3);

        print(mainlist);

    }
}
