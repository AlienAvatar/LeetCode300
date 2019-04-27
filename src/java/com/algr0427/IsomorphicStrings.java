package com.algr0427;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 *
 * Example 1:
 *
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 *
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 *
 * Input: s = "paper", t = "title"
 * Output: true
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] map = new int[256];

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            if(map[sc[i]] == 0){
                map[sc[i]] = tc[i];
            }else{
                if(map[sc[i]] != tc[i]){
                    return false;
                }
            }
        }
        int[] map2 = new int[256];
        for(int j = 0; j < t.length(); j++){
            if(map2[tc[j]] == 0){
                map2[tc[j]] = sc[j];
            }else{
                if(map2[tc[j]] != sc[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
