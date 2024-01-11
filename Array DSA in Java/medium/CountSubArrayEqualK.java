package com.Array.medium;

public class CountSubArrayEqualK {
    static int findSubArraySum(int Arr[], int N, int k)
    {
        int count=0;
        // code here
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum+=Arr[j];
                if(sum==k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[]={10 , 2, -2, -20, 10};
        int N=5;
        System.out.println( findSubArraySum(arr,N,-10));
    }
}
