package com.algr0407;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res += Math.pow(26,s.length() - 1 - i) * (s.charAt(i) - 64);
        }
        return res;
    }
}
