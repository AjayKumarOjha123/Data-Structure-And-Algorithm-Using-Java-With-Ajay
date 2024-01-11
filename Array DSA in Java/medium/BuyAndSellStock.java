package com.Array.medium;

public class BuyAndSellStock {

    public static int buyandSellStock(int arr[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>buyprice){
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=arr[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println( buyandSellStock(arr));
    }
}
