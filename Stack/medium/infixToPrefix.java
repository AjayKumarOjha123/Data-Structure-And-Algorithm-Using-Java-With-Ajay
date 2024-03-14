package com.Stack.medium;

import java.util.Stack;

public class infixToPrefix {

    public static String infixToPrefix(String s){
        Stack<String> val=new Stack<>();
        Stack<Character>op=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                String n=""+num;
                val.push(n);
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o= op.pop();
                    String str=o+v1+v2;
                    val.push(str);
                }
                op.pop(); //Opening Hata Diya
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    String v2=val.pop();
                    String v1=val.pop();
                    char o= op.pop();
                    String str=o+v1+v2;
                    val.push(str);
                    //push
                    op.push(ch);
                }
                else{
                    if(ch=='*' || ch=='/'){
                        if(op.peek()=='*' || op.peek()=='/') {
                            //work
                            String v2=val.pop();
                            String v1=val.pop();
                            char o= op.pop();
                            String str=o+v1+v2;
                            val.push(str);
                            //push
                            op.push(ch);
                        }
                        else{
                            op.push(ch);
                        }
                    }
                }
            }
        }
        //Last Work
        while(val.size()!=1){
            //work
            //work
            String v2=val.pop();
            String v1=val.pop();
            char o= op.pop();
            String str=o+v1+v2;
            val.push(str);
        }
        String res=val.peek();
        return res;
    }
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        System.out.println(infixToPrefix(s));
    }
}
