package com.algr0405;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {
    /**
     * Time Limit Exceeded
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        Arrays.sort(chs);
        Arrays.sort(cht);

        String res = new String(chs);
        String ret = new String(cht);
        /*for(Character cs : chs){
            res += cs;
        }
        for(Character ct : cht){
            ret += ct;
        }*/
        return res.equals(ret);
    }
}
