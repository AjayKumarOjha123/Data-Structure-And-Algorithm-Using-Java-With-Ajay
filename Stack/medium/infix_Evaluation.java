package com.Stack.medium;

import java.util.Stack;

public class infix_Evaluation {

    public static int infix(String s){
        Stack<Integer>val=new Stack<>();
        Stack<Character>op=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int num=ch-'0';
            if(num>=0 && num<=9){
                val.push(num);
            }
            else if(op.isEmpty() || ch=='(' || op.peek()=='('){
                op.push(ch);
            }
            else if(ch==')'){
                while(op.peek()!='('){
                    //work
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }
                    else if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                    else if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                    else if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                    op.pop();
                }
                op.pop(); //Opening Hata Diya
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    int v2=val.pop();
                    int v1=val.pop();
                    if(op.peek()=='+'){
                        val.push(v1+v2);
                    }
                   else if(op.peek()=='-'){
                        val.push(v1-v2);
                    }
                   else if(op.peek()=='*'){
                        val.push(v1*v2);
                    }
                   else if(op.peek()=='/'){
                        val.push(v1/v2);
                    }
                   //push
                    op.push(ch);
                }
                else{
                    if(ch=='*' || ch=='/'){
                        if(op.peek()=='*' || op.peek()=='/') {
                            //work
                            int v2 = val.pop();
                            int v1 = val.pop();
                            if (op.peek() == '*') {
                                val.push(v1 * v2);
                            } else if (op.peek() == '/') {
                                val.push(v1 / v2);
                            }
                            op.pop();
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
            int v2=val.pop();
            int v1=val.pop();
            if(op.peek()=='+'){
                val.push(v1+v2);
            }
            else if(op.peek()=='-'){
                val.push(v1-v2);
            }
            else if(op.peek()=='*'){
                val.push(v1*v2);
            }
            else if(op.peek()=='/'){
                val.push(v1/v2);
            }
            //pop operator
            op.pop();
        }
        int res=val.peek();
        return res;
    }
    public static void main(String[] args) {
        String s="8-(5+3)*4/6";
        System.out.println(infix(s));
    }
}
