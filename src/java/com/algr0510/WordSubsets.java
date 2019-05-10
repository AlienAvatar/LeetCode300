package com.algr0510;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSubsets {
    public List<String> wordSubsets(String[] A, String[] B) {
        Map<String,Integer> map = merge(B);
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < A.length; i++){
            String word = A[i];
            boolean check = true;
            for(String letter : map.keySet()){
                for(int j = 1; j <= map.get(letter) && check; j++){
                    if(word.indexOf(letter) == -1){
                        check = false;
                    }
                    word = word.replaceFirst(letter,"");
                }
            }
            if(check){
                list.add(A[i]);
            }
        }
        return list;
    }

    private Map<String,Integer> merge(String[] B){
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(String str : B){
            for(Character c : str.toCharArray()){
                String word = String.valueOf(c);
                if(map.get(word) == null){
                    map.put(word,1);
                }
                map.put(word,Math.max(map.get(word),str.length()-str.replaceAll(word,"").length()));
            }
        }
        return map;
    }

}
