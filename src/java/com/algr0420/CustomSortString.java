package com.algr0420;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.
 *
 * S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.
 *
 * Return any permutation of T (as a string) that satisfies this property.
 *
 * Example :
 * Input:
 * S = "cba"
 * T = "abcd"
 * Output: "cbad"
 * Explanation:
 * "a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a".
 * Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.
 */
public class CustomSortString {
    /**
     * 保证字符一样
     * 遍历T的字符串，如果S中没有的字符，则加上
     *
     * @param S
     * @param T
     * @return
     */
    public String customSortString(String S, String T) {
        Map<Character, StringBuilder> dictionaryOrder = new LinkedHashMap<>();
        for(Character c : S.toCharArray()){
            dictionaryOrder.put(c,new StringBuilder());
        }

        for(Character c : T.toCharArray()){
            if(dictionaryOrder.containsKey(c)){
                dictionaryOrder.get(c).append(c);
            }else{
                dictionaryOrder.put(c,new StringBuilder());
                dictionaryOrder.get(c).append(c);
            }
        }

        String res = "";
        for(Character m : dictionaryOrder.keySet()){
            res += dictionaryOrder.get(m);
        }
        return res;
    }
}
