package com.BinarySearch.BinarySearch_On_Answer;

public class Gas_Station {

    public static int gasStation(int[] gas, int[] cost) {
        int totDiff=0;
        int fuil=0;
        int idx=0;
        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            totDiff+=diff;
            fuil+=diff;
            if(fuil<0){
                idx=i+1;
                fuil=0;
            }
        }
        if(totDiff<0){
            return -1;
        }
        else{
            return idx;
        }
    }
    public static void main(String[] args) {
      int [] gas = {1,2,3,4,5}; int cost[] = {3,4,5,1,2};
        System.out.println(gasStation(gas,cost));
    }
}
