package com.algr0528;

public class MaximumAverageSubarray {
    /*public double findMaxAverage(int[] nums, int k) {
        double max = Double.NEGATIVE_INFINITY;

        for(int i = 0; i < nums.length; i++){
            double sum = nums[i];
            for(int j = i+1; j < i+k && i+k-1 < nums.length; j++){
                sum += nums[j];
            }
            double t = sum/k;
            max = Math.max(t,max);
        }
        return max;
    }*/
    public double findMaxAverage(int[] nums, int k) {
        int[] sums = new int[nums.length];
        for(int i = 1; i < nums.length; i++){
            sums[i] = nums[i] + sums[i-1];
        }

        double res = sums[k-1]*1.0/k;

        for(int i = k; i < nums.length; i++){
            res = Math.max(res,(sums[i] - sums[i-k])*1.0/k);
        }
        return res;
    }

}
