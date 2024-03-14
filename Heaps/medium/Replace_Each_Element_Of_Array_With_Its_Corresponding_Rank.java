package com.Heaps.medium;
import java.util.*;
public class Replace_Each_Element_Of_Array_With_Its_Corresponding_Rank {
    public static List<Integer> replaceWithRank(List<Integer> arr, int n) {
        // Write your code here
        Map<Integer,Integer>map=new HashMap<>();
        List<Integer>list=new ArrayList<Integer>();
        list.addAll(arr);
        Collections.sort(list);
        int temp=1;
        for(int i=0;i<list.size();i++){
            if(map.get(list.get(i))==null){
                map.put(list.get(i), temp);
                temp++;
            }
        }

        list.clear();
        for(int i=0;i<arr.size();i++){
            list.add(map.get(arr.get(i)));
        }
        return list;
    }
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(7);
        list.add(2);
        list.add(90);
        System.out.println(replaceWithRank(list,list.size()));
    }
}
