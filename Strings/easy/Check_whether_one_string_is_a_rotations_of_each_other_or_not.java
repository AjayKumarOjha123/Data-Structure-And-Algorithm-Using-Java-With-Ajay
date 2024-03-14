package com.Strings.easy;

public class Check_whether_one_string_is_a_rotations_of_each_other_or_not {

    //Brute Force Apporoach
    public static boolean check_whether_one_string_is_a_rotations_of_each_other_or_not(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp=s1+s1;
        if(temp.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       String s1 ="geeksforgeeks";
       String s2= "forgeeksgeeks";
       System.out.println(check_whether_one_string_is_a_rotations_of_each_other_or_not(s1,s2));
    }
}
