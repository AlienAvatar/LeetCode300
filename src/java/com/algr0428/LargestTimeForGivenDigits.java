package com.algr0428;

/**
 * Given an array of 4 digits, return the largest 24 hour time that can be made.
 *
 * The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.
 *
 * Return the answer as a string of length 5.  If no valid time can be made, return an empty string.
 *
 *
 *
 * Example 1:
 *
 * Input: [1,2,3,4]
 * Output: "23:41"
 * Example 2:
 *
 * Input: [5,5,5,5]
 * Output: ""
 */
public class LargestTimeForGivenDigits {
    /**
     * 4个数字全排列总共有24种可能，判断每一种可能是否能组成合法时间值，如果能，再和当前保存的最大值进行比较；
     * 最大值是一个int值，用来表示分钟数；
     */
    public String largestTimeFromDigits(int[] array) {
       /* if(A[0]+A[1]+A[2]+A[3] == 0){
            return "00:00";
        }
        int largestTime = -1;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i != j){
                    for(int k = 0; k < 4; k++){
                        if(k != i && k != j){
                            int l = 6 - i - j - k;
                            int re = largest(A[i],A[j],A[k],A[l]);
                            largestTime = Math.max(largestTime,re);
                        }
                    }
                }
            }
        }

        if(largestTime == -1){
            return "";
        }
        return String.format("%2d:%2d",largestTime/60,largestTime%60);*/
        int largestTime = -1;

        // 暴力枚举出每种可能
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j != i) {
                    for (int k = 0; k < 4; k++) {
                        if (k != i && k != j) {
                            // 0,1,2,3 总和为6，故剩下的index为6-
                            int l = 6 - i - j - k;

                            int result = largestTimeHelper(array[i], array[j], array[k], array[l]);

                            largestTime = Math.max(result, largestTime);
                        }
                    }
                }
            }
        }
        if (largestTime==-1){
            return "";
        }
        return String.format("%2d:%2d",largestTime/60,largestTime%60);
    }

    private int largestTimeHelper(int a,int b, int c,int d){
        int hours = a * 10 + b;
        int min = c * 10 + d;

        if (hours < 24 && min < 60) {
            // 返回分钟数
            return hours * 60 + min;
        }
        return -1;
    }
}
