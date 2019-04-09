package com.algr0402;

import java.util.*;


public class TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int n : map.keySet()){
            int val = map.get(n);
            if(bucket[val] == null){
                bucket[val] = new LinkedList<>();
            }
            bucket[val].add(n);
        }

        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length-1; i > 0 && k > 0; --i){
            if(bucket[i] != null){
                List<Integer> list = bucket[i];
                res.addAll(list);
                k = k - list.size();
            }
        }
        return res;
    }
}
