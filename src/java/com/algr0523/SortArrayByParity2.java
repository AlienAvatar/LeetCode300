package com.algr0523;

public class SortArrayByParity2 {
    public int[] sortArrayByParityII(int[] A) {
        int[] nums = new int[A.length];
        int j = 0;
        int k = 1;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                nums[2*j++] = A[i];
            }else {
                nums[(2*k++)-1] = A[i];
            }
        }
        return nums;
    }
}
