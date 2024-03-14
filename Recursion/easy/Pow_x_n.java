package com.Recursion.easy;

public class Pow_x_n {

    public static int pow(int x,int n){
        return solve(x,(long)n);
    }

    private static int solve(int x, long n) {
        if(n==0){
            return 1;
        }
        if(n<0){
           return solve((1/x),-n);
        }
        if(n%2==0){
            return solve(x*x,n/2);
        }
        else{
            return x*solve((x*x),(n-1)/2);
        }
    }

    public static void main(String[] args) {
        System.out.println( pow(3,3));
    }
}
