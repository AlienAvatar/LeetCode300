package com.algr0403;

import java.util.Stack;

public class BasicCalculator {
    public int calculate(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        int ch;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char num = s.charAt(i);
            if(Character.isDigit(num)){
                ch = 10 * (num - '0');
                stack.push(ch);
            }
            if(!Character.isDigit(num)) {
                if (s.charAt(i) == '+') {
                    stack.push(+num);
                }
                if (s.charAt(i) == '-') {
                    stack.push(-num);
                }
                if(s.charAt(i) == '*'){
                    stack.push(stack.pop() * num);
                }
                if(s.charAt(i) == '/'){
                    stack.push(stack.pop() / num);
                }
            }
        }

        int re = 0;
        for(int c : stack){
            re += c;
        }
        return re;
    }
}
