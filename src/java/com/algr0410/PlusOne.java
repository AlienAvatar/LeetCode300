package com.algr0410;

public class PlusOne {
    /**
     * 数组元素转换为整数
     *          long sum = 0;
     *         long t = 1;
     *         for(int i = 0; i <= digits.length-1; i++){
     *             sum += digits[digits.length-1-i] * t;
     *             t = t * 10;
     *         }
     *
     *         进位如何处理数组的元素
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {
        int carries = 1;
        for(int i = digits.length - 1; i >= 0 && carries > 0 ; i--){
            int sum = digits[i] + carries;
            digits[i] = sum % 10;
            carries = sum / 10;
        }

        if(carries == 0){
            return digits;
        }

        //进位处理
        int[] rst = new int[digits.length+1];
        rst[0] = 1;
        for(int i=1; i< rst.length; i++){
            rst[i] = digits[i-1];
        }
        return rst;
    }
}
