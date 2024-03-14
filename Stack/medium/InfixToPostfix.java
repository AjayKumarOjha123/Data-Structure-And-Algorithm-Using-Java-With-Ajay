package com.Stack.medium;

import java.util.Stack;

public class InfixToPostfix {
    public static String infixToPostfix(String s) {
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                val.push(String.valueOf(ch));
            } else if (op.isEmpty() || ch == '(' || op.peek() == '(') {
                op.push(ch);
            } else if (ch == ')') {
                while (!op.isEmpty() && op.peek() != '(') {
                    performOperation(val, op);
                }
                op.pop(); // Remove '('
            } else {
                handleOperator(ch, val, op);
            }
        }

        // Process any remaining operators in the stack
        while (!op.isEmpty()) {
            performOperation(val, op);
        }

        return val.peek();
    }

    private static void handleOperator(char ch, Stack<String> val, Stack<Character> op) {
        while (!op.isEmpty() && getPrecedence(ch) <= getPrecedence(op.peek())) {
            performOperation(val, op);
        }
        op.push(ch);
    }

    private static void performOperation(Stack<String> val, Stack<Character> op) {
        String v2 = val.pop();
        String v1 = val.pop();
        char o = op.pop();
        String str = v1 + v2 + o;
        val.push(str);
    }

    private static int getPrecedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        } else if (operator == '^') {
            return 3; // XOR has higher precedence than other operators
        }
        return -1; // Invalid operator
    }

    public static void main(String[] args) {
        String s = "a+b+c+d-e^f";
        System.out.println(infixToPostfix(s));
    }
}
