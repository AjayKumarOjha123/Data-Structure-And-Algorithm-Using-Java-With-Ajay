package com.Array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindNumberApperOnes {

    //Brute Force Apporoach
public static int findNumberApperOnes1(int arr[]){

      for(int i=0 ; i<arr.length;i++) {
          boolean status = false;
        for (int j = 0; j < arr.length; j++) {
            if (i != j && arr[i] == arr[j]) {
                status = true;
                break;
            }
        }
        if(!status) return arr[i];
    }
        return -1;
}

//Optimal Apporoach
public static int findNumberAppearOnes(int arr[]){
    HashMap<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else {
            map.put(arr[i],1);
        }
    }
    Set<Map.Entry<Integer,Integer>>it=map.entrySet();
     for(Map.Entry<Integer,Integer>e : it){
         if(e.getValue()==1){
             return e.getKey();
         }
     }
     return -1;
}
    public static void main(String[] args) {
        int arr[]={2,3,3,2,5,2,2,3,5,9,9};
       System.out.println(findNumberApperOnes1(arr));
        System.out.println(findNumberAppearOnes(arr));
    }
}
