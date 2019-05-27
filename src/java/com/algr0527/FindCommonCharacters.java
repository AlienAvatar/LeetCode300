package com.algr0527;

import java.util.*;

public class FindCommonCharacters {
    public List<String> ducommonChars(String[] A) {
        int[] dups = null;
        for(String word: A){
            int[] ups = new int[26];
            char[] chs = word.toCharArray();
            for(char c : chs){
                int t = c - 'a';
                if(dups == null || dups[t] > ups[t]){
                    ups[t]++;
                }
            }
            dups = ups;
        }

        List<String> list = new ArrayList<>();
        for(int i = 0; i < dups.length;i++){
            for(int j = 0; j <dups[i]; j++){
                list.add(Character.toString((char)(i+'a')));
            }
        }
        return list;
    }
}
