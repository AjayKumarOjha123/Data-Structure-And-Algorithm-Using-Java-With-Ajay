package com.Array.Hard;
import java.util.*;
public class FourSum {

    //Brute Force Apporoach
        public static List<List<Integer>> fourSum(int[] arr, int target) {
            int n=arr.length;
            HashSet<ArrayList<Integer>>list=new HashSet<>();
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    for(int k=j+1;k<n;k++){
                        for(int l=k+1;l<n;l++){
                            int sum=arr[i]+arr[j]+arr[k]+arr[l];
                            if(sum==target){
                                ArrayList<Integer>temp=new ArrayList<>();
                                temp.add(arr[i]);
                                temp.add(arr[j]);
                                temp.add(arr[k]);
                                temp.add(arr[l]);
                                Collections.sort(temp);
                                list.add(temp);
                            }
                        }
                    }
                }
            }
            return new ArrayList<>(list);
        }

        //Optimal Apporoach
    public static ArrayList<ArrayList> foursum(int arr[],int target){
            int n=arr.length;
            ArrayList<ArrayList<Integer>>list=new ArrayList<>();
            if(n<4){
                return new ArrayList<>(list);
            }
            Arrays.sort(arr);
            int i=0;
            for(int j=i+1;j<n;j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        int sum = arr[j] + arr[k] + arr[l];
                        if (sum == target - arr[i]) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);
                            list.add(temp);
                        }
                    }
                }
                i++;
            }
            return new ArrayList<>(list);
    }

    public static void main(String[] args) {
        int arr[]={1,0,-1,0,-2,2};
        System.out.println( foursum(arr,0));
    }

}
