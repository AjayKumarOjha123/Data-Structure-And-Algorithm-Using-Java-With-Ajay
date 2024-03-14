package com.BinarySearch.OneDArray;

import java.util.HashMap;
import java.util.Map;

public class Single_Element {
    //Brute Force
    public static int singleElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            boolean status = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    status = false;
                    continue;
                }
            }
            if (status) {
                return arr[i];
            }
        }
        return -1;
    }

    //Better Apporoach
    public static int single_Element(int arr[]) {
        int single = 0;
        for (int i = 0; i < arr.length; i++) {
            single = single ^ arr[i];
        }
        return single;
    }

    //Better Apporoach 2
    public static int singleelement(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return -1;
    }

    //Better Apporoach 3

    public static int single_element(int arr[]) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        for (int i = 0; i < n; i++) {
            // Check for first index
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[i];
                }
            }
            //Check for last index
            else if (i == n - 1) {
                if (arr[i] != arr[i - 1]) {
                    return arr[i];
                }
            } else {
                if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1])
                    return arr[i];
            }
        }
        return -1;
    }

    //Single Element Using  Binary Search This is Optimal Apporoach

        public static void main (String [] args){
            int  arr[] = {2, 2, 3, 3, 4, 4, 27, 27, 32, 32, 36, 36, 41, 41, 42, 42, 45};
            //System.out.println(singleElement(arr));
            // System.out.println(single_Element(arr));
            // System.out.println(singleelement(arr));
            // System.out.println(single_element(arr));
    }
}

