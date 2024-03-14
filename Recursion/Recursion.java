package com.Recursion;


public class Recursion {

    // Print 1 To n Number Using Recursion
    public static void printUpward(int num){
        if(num==0){
            return;
        }
        printUpward(num-1);
        System.out.println(num);
    }

    // Print n To 1 Number Using Recursion

    public static void printBackward(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printBackward(n-1);
    }

    //Reverse Array Using Recursion

    public static void reverseArray(int arr[],int i,int j){

        if(i>j){
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverseArray(arr,i+1,j-1);
    }

    // Check String is Plaindrome or Not Using Recursion

    public static boolean checkPlaindrome(String str,int i,int j){

        if(str.length()==1){
            return true;
        }
        if(str.charAt(i)!=str.charAt(j)){
            return false;
        }
        if(i>j){
            return true;
        }
        checkPlaindrome(str,i+1,j-1);
        return true;
    }

    //Sum Of N Natural Number Using Recursion


    public static int sum(int n){
        if(n==1){
            return 1;
        }
       return n+sum(n-1);
    }

    //Calculate Factorial Using Recursion

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    //Calculate Power Using Recursion

    static int pow(int N,int R){
        if(R==0){
            return 1;
        }
        if(R==1){
            return N;
        }
        return N*pow(N,R-1);
    }

    //Check Prime or Not Using Recursion

    public static boolean checkPrime(int num ,int i){
       if(i==1) return true;
       if(num%i==0){
            return false;
        }
         return checkPrime(num,i-1);
    }

    public static void main(String[] args) {
        int num=20;
        System.out.println( checkPrime(num,(num/2)));
    }

}
