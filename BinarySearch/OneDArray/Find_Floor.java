package com.BinarySearch.OneDArray;

public class Find_Floor {
    public static int findFloor(int arr[],int x){
        int num=-1;
        int si=0;
        int ei=arr.length-1;
        while(si<=ei){
            int mid=(si+ei)/2;
            if(arr[mid]<=x) {
                num = arr[mid];
                si = mid + 1;
            }
            else{
                ei=mid-1;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int  n=6, x=106, a[]={66 ,67 ,68 ,69 ,70 ,71 ,72 ,73 ,74 ,75 ,76 ,77 ,
                78 ,79 ,80 ,81 ,82 ,83 ,84 ,85 ,86 ,87 ,88 ,89 ,90 ,91 ,92 ,93
                ,94 ,95 ,96 ,97 ,98 ,99 ,100 ,101 ,102 ,103 ,104 ,105 ,106 ,107
                ,108 ,109 ,110 ,111 ,112 ,113 ,114 ,115 ,116 ,117 ,118 ,119 ,120
                ,121 ,122 ,123 ,124 ,125 ,126 ,127 ,128 ,129 ,130};
        System.out.println(findFloor(a,x));
    }
}
