package com.Strings.medium;

public class Implement_Atoi {
    public static int implement_Atoi(String str){
        int result=0;
        boolean status=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                result=(result*10)+num;
            }else if(i==0 && ch=='-'){
                status=false;
            }
            else{
                return -1;
            }
        }
        if(!status){
            result=(result*-1);
        }
        return result;
    }
    public static void main(String[] args) {
        String s="-123";
        System.out.println(implement_Atoi(s));
    }
}
