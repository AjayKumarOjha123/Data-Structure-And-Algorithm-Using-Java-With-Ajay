package com.BinarySearch.OneDArray;

import java.util.Arrays;

public class Find_Floor_And_Ceil {

    public static int[] find_Floor_And_Ceil(int arr[], int x) {
        int n = arr.length;
        Arrays.sort(arr);
        int floor = -1;
        int ceil = -1;
        int si = 0;
        int ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        si = 0;
        ei = n - 1;
        while (si <= ei) {
            int mid = si + (ei - si) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                ei = mid - 1;
            } else {
                si = mid + 1;
            }
        }
        int ans[]={floor,ceil};
        return ans;
    }

        public static void main (String[]args){
            int n = 6, x = 2, a[] = {3, 4, 4, 7, 8, 10};
            System.out.println(Arrays.toString(find_Floor_And_Ceil(a, x)));
        }
    }

