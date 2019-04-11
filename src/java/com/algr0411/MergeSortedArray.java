package com.algr0411;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArray {
    /*public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m > nums1.length || n > nums2.length){
            return;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            list.add(nums1[i]);
        }
        for(int j = 0; j < n; j++){
            list.add(nums2[j]);
        }
        int[] res = new int[m+n];
        for(int k = 0; k < list.size(); k++){
            res[k] = list.get(k);
        }
        Arrays.sort(res);
        nums1 = res;
    }*/

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1,j = n-1,index = m+n-1;
        while(i >= 0 && j>= 0){
            if(nums1[i] > nums2[j]){
                nums1[index--] = nums1[i--];
            }else{
                nums1[index--] = nums2[j--];
            }
        }

        while(i >= 0){
            nums1[index--] = nums1[i--];
        }

        while(j >= 0){
            nums2[index--] = nums2[j--];
        }
    }
}
