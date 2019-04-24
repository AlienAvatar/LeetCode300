package com.algr0424;

import java.util.HashSet;
import java.util.Set;

public class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        int res = 0,cur = 0,count_b = 0,a = 0,b = 0;
        for(int c : tree){
            cur = c == a || c == b? cur + 1 : count_b + 1;
            count_b = c == b? count_b + 1 : 1;
            if(b != c){
                a = b;
                b = c;
            }
            res = Math.max(res,cur);
        }
        return res;
    }
}
