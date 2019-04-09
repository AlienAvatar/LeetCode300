package com.algr0408;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    //****
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i = 1; i <= numRows; ++i){
            List<Integer> tmp = new ArrayList<>();
            tmp.add(0,1);
            for(int j = 1; j < i-1; ++j){
                int val = list.get(i-2).get(j-1) + list.get(i-2).get(j);
                tmp.add(j,val);
            }
            if(i > 1){
                tmp.add(i-1,1);
            }
            list.add(tmp);
        }
        return list;
    }
}
