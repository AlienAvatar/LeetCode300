package com.algr0409;

public class RotateArray {
    /**
     * 暴列法
     * [1,2,3,4,5,6,7]和k = 3
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int previous,temp;
        for(int i = 0; i < k; i++){
            previous = nums[nums.length-1];
            for(int j = 0; j < nums.length;j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }
    }
}
