package com.algr0514;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> dict = new HashMap<>();
        dict.put('a', ".-");
        dict.put('b', "-...");
        dict.put('c', "-.-.");
        dict.put('d', "-..");
        dict.put('e', ".");
        dict.put('f', "..-.");
        dict.put('g', "--.");
        dict.put('h', "....");
        dict.put('i', "..");
        dict.put('j', ".---");
        dict.put('k', "-.-");
        dict.put('l', ".-..");
        dict.put('m', "--");
        dict.put('n', "-.");
        dict.put('o', "---");
        dict.put('p', ".--.");
        dict.put('q', "--.-");
        dict.put('r', ".-.");
        dict.put('s', "...");
        dict.put('t', "-");
        dict.put('u', "..-");
        dict.put('v', "...-");
        dict.put('w', ".--");
        dict.put('x', "-..-");
        dict.put('y', "-.--");
        dict.put('z', "--..");

        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++){
            char[] chs = words[i].toCharArray();
            String sum = "";
            for(int j = 0; j < chs.length; j++){
                sum += dict.get(chs[j]);
            }
            set.add(sum);
        }
        return set.size();
    }
}
