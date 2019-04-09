package com.algr0409;

import java.lang.reflect.Array;
import java.util.*;

public class IntersectionOfTwoArray2 {
    /**
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     * 利用HashMap
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums1.length; i++){
            if(!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }

        for(int j = 0; j < nums2.length; j++){
            if(map.containsKey(nums2[j]) && map.get(nums2[j]) > 0){
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
            }
        }

        int[] res = new int[list.size()];
        for(int k = 0; k < res.length; k++){
            res[k] = list.get(k);
        }
        Arrays.sort(res);
        return res;
    }
}
