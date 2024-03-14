package com.Stack.medium;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>s=new Stack<>();
        for(int a : asteroids){
            if(s.isEmpty()){
                s.push(a);
            }
           else if(s.peek()<0){
                s.push(a);
            }
           else if(s.peek()<0 && a<0){
               s.push(a);
            }
           else if(s.peek()>0 && a>0){
               s.push(a);
            }
           else{
              while(!s.isEmpty() && a<0 && s.peek()>0){
                  int sum=s.peek()+a;
                  if(sum==0){
                      a=0;
                      s.pop();
                      break;
                  }
                  if(sum<0){
                      s.pop();
                  }else if(sum>0){
                      a=0;
                  }
                  else{
                      break;
                  }
              }
              if(a!=0){
                  s.push(a);
              }
           }
        }
        int ans[]=new int[s.size()];
        for(int i=ans.length-1;i>=0;i--){
            ans[i]=s.pop();
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={-2,-2,1,-2};
        asteroidCollision(arr);
    }
}
