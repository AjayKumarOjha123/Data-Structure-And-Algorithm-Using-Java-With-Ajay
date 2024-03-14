package com.GreedyAlgorithm.easy;

public class Lemonade_Change {
    public static boolean lemonadeChange(int[] bills) {
        int count5=0;
        int count10=0;
        for(int i=0;i<bills.length;i++){
            if(bills[i]==5){
                count5++;
            }
            else if(bills[i]==10){
                count10++;
                if(count5>=1){
                    count5--;
                }
                else{
                    return false;
                }
            }
            else{
                if(count10>=1 && count5>=1){
                    count10--;
                    count5--;
                }
                else if(count5>=3){
                    count5-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int bills[]={5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }
}
