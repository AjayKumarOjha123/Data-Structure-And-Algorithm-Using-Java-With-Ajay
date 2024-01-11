package com.Array.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {

    public static int majorityElement(int arr[]){
        int halfArray=arr.length/2;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Map.Entry<Integer,Integer>>it=map.entrySet();
        for(Map.Entry<Integer,Integer>e : it){
            int value=e.getValue();
            if(value>halfArray){
                return e.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(majorityElement(arr));
    }
}
