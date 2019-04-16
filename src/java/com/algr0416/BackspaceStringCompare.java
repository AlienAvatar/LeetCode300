package com.algr0416;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.
 *
 * Example 1:
 *
 * Input: S = "ab#c", T = "ad#c"
 * Output: true
 * Explanation: Both S and T become "ac".
 * Example 2:
 *
 * Input: S = "ab##", T = "c#d#"
 * Output: true
 * Explanation: Both S and T become "".
 */
public class BackspaceStringCompare {
    /**
     *
     * @param S
     * @param T
     * @return
     */
    //succed
    public boolean backspaceCompare(String S, String T) {
        char[] arrS = S.toCharArray();
        char[] arrT = T.toCharArray();
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i = 0; i < arrS.length; i++){
            if(!stack1.isEmpty() && arrS[i] == '#'){
                stack1.pop();
            }else if(arrS[i] != '#'){
                stack1.push(arrS[i]);
            }
        }
        for(int i = 0; i < arrT.length; i++){
            if(!stack2.isEmpty() && arrT[i] == '#'){
                stack2.pop();
            }else if(arrT[i] != '#'){
                stack2.push(arrT[i]);
            }
        }
        String re1 = "";
        for(Character s : stack1){
            re1 += s;
        }

        String re2 = "";
        for(Character s : stack2){
            re2 += s;
        }
        return re1.equals(re2);
    }
}
