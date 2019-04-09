package com.algr0407;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int re = -1;
        if(s == null || s.length() == 0){
            return re;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),0);
            }
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1 && map.get(s.charAt(i)) != null){
                re = s.indexOf(s.charAt(i));
                break;
            }
        }
        return re;
    }
}
