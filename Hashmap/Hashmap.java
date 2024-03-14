package com.Hashmap;

import java.util.*;


public class Hashmap {
    public static void main(String[] args) {
        //Creating a Map
        HashMap<String,Integer>map=new HashMap<>();

        //insert data in Map.

        map.put("india",130);
        map.put("Chenie",132);
        map.put("bihar",150);
        map.put("india",140);
        System.out.println(map);

        //Delete data in Map

        System.out.println(map.remove("india"));
        System.out.println(map.remove("i"));

        //Size Of Map

        System.out.println("Size Of Map is = "+map.size());
        System.out.println(map);

        //iterate in Map

        Set<Map.Entry<String,Integer>>it=map.entrySet();
        for (Map.Entry<String,Integer> e : it){
            System.out.print(e.getKey()+",");
            System.out.print(e.getValue());
        }

        //Contains Key

        System.out.println();

        System.out.println(map.containsKey("india"));

        // LinkedHashMap --> Order Maintain Karta Hai

        LinkedHashMap<String,Integer>lm=new LinkedHashMap<>();
        lm.put("A",130);
        lm.put("B",132);
        lm.put("D",150);
        lm.put("C",140);
        System.out.println(lm);

        // TreeMap -->

        TreeMap<String ,Integer>tm=new TreeMap<>();
        tm.put("A",130);
        tm.put("B",132);
        tm.put("D",150);
        tm.put("C",140);
        System.out.println(tm);

    }
}
