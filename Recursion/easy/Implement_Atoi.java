package com.Recursion.easy;

public class Implement_Atoi {
    public static int implementAtoi(String s){
        boolean status=false;
        long ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(i==0 && ch-'0'>9){
                return 0;
            }

           else if(ch==' '){
                continue;
            }
           else if(ch=='-'){
                status=true;
                continue;
            }
           else if(ch-'0'>=0 && ch-'0'<=9){
                int num=ch-'0';
                ans=(ans*10)+num;
            }
        }
        if(status){
            return (int)ans*-1;
        }
        return (int)ans;
    }

    //Optimal Solution Leetcode

  static   class Solution {
        public int myAtoi(String s) {
            if(s.length()==0){
                return 0;
            }
            long num=0;
            char ch[]=s.toCharArray();
            int i=0;
            int sign=1;
            char current=ch[i];

            //ignore white space
            while(current==' '){
                i++;
                if(i==ch.length){
                    return 0;
                }
                current=ch[i];
            }
            //check minus
            if(current=='-'){
                sign=-1;
                i++;
            }
            //check plus
            else if(current=='+'){
                sign=1;
                i++;
            }
            // check number
            for(; i<ch.length;i++){
                current=ch[i];
                if(current<'0' || current>'9'){
                    break;
                }

                //if number then store
                else{
                    // num*=10;
                    // num+=current-'0';
                    num=(num*10)+current-'0';
                    if(sign*num <=Integer.MIN_VALUE){
                        return Integer.MIN_VALUE;
                    }
                    if(sign*num >=Integer.MAX_VALUE){
                        return Integer.MAX_VALUE;
                    }
                }
            }
            num*=sign;
            return (int)num;
        }
    }

    public static void main(String[] args) {
        String s="-91283472332";
        System.out.println(implementAtoi(s));
        Solution sa=new Solution();
        System.out.println( sa.myAtoi(s));
    }
}
