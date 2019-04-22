package com.algr0422;

import java.util.HashSet;
import java.util.Set;

/**
 * Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
 *
 * Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
 *
 * Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
 *
 * If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.
 *
 *
 *
 * Example 1:
 *
 * Input: A = [1,1], B = [2,2]
 * Output: [1,2]
 * Example 2:
 *
 * Input: A = [1,2], B = [2,3]
 * Output: [1,2]
 * Example 3:
 *
 * Input: A = [2], B = [1,3]
 * Output: [2,3]
 * Example 4:
 *
 * Input: A = [1,2,5], B = [2,4]
 * Output: [5,4]
 */
public class FairCandySwap {
    /**
     * 1.从A中取出一个元素，从B中取出一个元素，进行交换
     * 2.相加A中的元素，相加B中的元素
     * 3.是否相等
     * Time Limit Exceeded
     * @param A
     * @param B
     * @return
     */
    /*public int[] fairCandySwap(int[] A, int[] B) {
        int[] res = new int[2];
        for(int k = 0; k < A.length; k++){
            for(int l = 0; l < B.length; l++){
                int sumA = 0;
                int sumB = 0;
                int tmp = A[k];
                A[k] = B[l];
                B[l] = tmp;
                for(int i = 0; i < A.length; i++){
                    sumA += A[i];
                }
                for(int i = 0; i < B.length; i++){
                    sumB += B[i];
                }
                if(sumA == sumB){
                    res[0] = B[l];
                    res[1] = A[k];
                    return res;
                }
                int tmp2 = A[k];
                A[k] = B[l];
                B[l] = tmp2;
            }
        }
        return res;
    }*/

    public int[] fairCandySwap(int[] A, int[] B) {
        int sa = 0;
        int sb = 0;
        Set<Integer> set = new HashSet<>();
        for(int n : A){
            sa += n;
            set.add(n);
        }
        for(int n : B){
            sb += n;
        }
         int d = (sa - sb) / 2;

        for(int n : B){
            if(set.contains(n + d)){
                return new int[] {n+d,n};
            }
        }
        return null;
    }
}
