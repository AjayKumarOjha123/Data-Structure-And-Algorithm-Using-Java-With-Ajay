package com.Array.easy;

public class CheckArraySorted {

    public static boolean checkArraySorted(int arr[]) {
        if (arr[0] < arr[arr.length - 1]) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    return false;
                }
            }

        }
        return true;
    }

        public static void main (String[]args){
            int arr[] = {50,4,30};
            System.out.println(checkArraySorted(arr));
        }
    }

