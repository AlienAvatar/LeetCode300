package com.algr0521;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        helper(list,new ArrayList<Integer>(),candidates,target,0);
        return list;
    }

    private void helper(List<List<Integer>> list,List<Integer> tempList,int[] nums,int redain,int start){
        if(redain < 0){
            return;
        }else if(redain == 0){
            list.add(new ArrayList<Integer>(tempList));
        }else{
            for(int i = start; i < nums.length; i++){
                if(i > start && nums[i-1] == nums[i]){
                    continue;
                }
                tempList.add(nums[i]);
                helper(list,tempList,nums,redain - nums[i],i+1);
                tempList.remove(tempList.size()-1);
            }
        }

    }
}
