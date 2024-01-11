package com.Array.Hard;
import java.util.*;
public class MejorityElement_2 {
    public static List<Integer> majorityElement(int[] arr) {
        int halfArray=arr.length/3;
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry<Integer,Integer>e : map.entrySet()){
            int value=e.getValue();
            if(value>halfArray){
                list.add(e.getKey());
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[]={3,2};
        System.out.println(majorityElement(arr));
    }
}
