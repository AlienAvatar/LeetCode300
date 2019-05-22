package com.algr0521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        helper(list,new ArrayList<Integer>(),nums,new boolean[nums.length]);
        return list;
    }

    private void helper(List<List<Integer>> list,List<Integer> tempList,int[] nums,boolean[] visited){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<Integer>(tempList));
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]) continue;
            if(i > 0 && nums[i-1] == nums[i] &&!visited[i-1]){
                continue;
            }else {
                tempList.add(nums[i]);
                visited[i] = true;
                helper(list, tempList, nums,visited);
                visited[i] = false;
                tempList.remove(tempList.size() - 1);
            }

        }
    }
}
