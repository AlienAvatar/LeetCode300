package com.algr0521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i = 1; i <= n; i++){
            nums[i-1] = i;
        }
        List<List<Integer>>  list = permute(nums);
        List<Integer> res = list.get(k-1);
        String str = "";
        for(int i : res){
            str += String.valueOf(i);
        }
        return str;
    }

    private List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(list,new ArrayList<Integer>(),nums);
        return list;
    }
    private void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<Integer>(tempList));
        }
        for(int i = 0; i < nums.length; i++){
            if(tempList.contains(nums[i])){
                continue;
            }else {
                tempList.add(nums[i]);
                helper(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }

        }
    }
}
