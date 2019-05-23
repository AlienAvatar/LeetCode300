package com.algr0523;

import java.util.ArrayList;
import java.util.List;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int[] nums = new int[A.length];
        List<Integer> list = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                nums[j++] = A[i];
            }else {
                list.add(A[i]);
            }
        }

        for(int n : list){
            nums[j++] = n;
        }
        return nums;
    }
}
