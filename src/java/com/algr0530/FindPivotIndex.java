package com.algr0530;

public class FindPivotIndex {
    /**
     *
     * @param nums
     * @return
     */
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums){
            sum += x;
        }

        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;


        /*int mid = nums.length / 2;
        int re = helper(0,0,mid,nums);
        return re;*/
    }
    //只解决了肯定相等的
    private int helper(int left,int right,int mid,int[] nums){
        for(int i = 0; i < mid; i++){
            left += nums[i];
        }
        for(int i = nums.length-1;i>mid;i--){
            right += nums[i];
        }
        if(left > right){
            return helper(0,0,mid-1,nums);
        }else if(left < right){
            return helper(0,0,mid+1,nums);
        }else if(left == right){
            return mid;
        }else{
            return -1;
        }
    }

}
