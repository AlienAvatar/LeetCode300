package com.algr0515;

import java.util.*;

public class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String,Integer> map = new HashMap<>();
        String[] stra = A.split(" ");
        for(int i = 0; i < stra.length; i++){
            if(map.containsKey(stra[i])) {
                map.put(stra[i], map.get(stra[i]) + 1);
            }else{
                map.put(stra[i],1);
            }
        }
        String[] strb = B.split(" ");
        for(int i = 0; i < strb.length; i++){
            if(map.containsKey(strb[i])) {
                map.put(strb[i], map.get(strb[i]) + 1);
            }else{
                map.put(strb[i],1);
            }
        }

        List<String> list = new ArrayList<>();

        for(String str : map.keySet()){
            int c = map.get(str);
            if(c == 1){
                list.add(str);
            }
        }

        String[] res = list.toArray(new String[list.size()]);
        return res;
    }
}
