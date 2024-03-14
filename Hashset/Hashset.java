package com.Hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hashset {
    public static void main(String[] args) {

        //Createing  HashSet

        HashSet<Integer>set=new HashSet<>();

        // insert data in HashSet
        set.add(120);
        set.add(130);
        set.add(140);
        set.add(150);

        // Print HashSet
        System.out.println(set);

        //Delete / remove in HashMap
        set.remove(120);
        System.out.println(set);

        //Size
        System.out.println(set.size());

        // iterator on HashSet

        Iterator<Integer>it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //LinkedHashSet in HashSet Creating

        LinkedHashSet<Integer>ls=new LinkedHashSet<>();
        ls.add(120);
        ls.add(130);
        ls.add(140);
        ls.add(150);
        System.out.println(ls);

        //TreeSet in HashSet

        TreeSet<Integer>ts=new TreeSet<>();

        ts.add(120);
        ts.add(13);
        ts.add(10);
        ts.add(150);
        System.out.println(ts);

        //isEmpty

        System.out.println(ts.isEmpty());

    }
}
