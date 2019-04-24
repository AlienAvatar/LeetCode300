package com.algr0423;

/**
 * 832. Flipping an Image
 * Easy
 *
 * 458
 *
 * 96
 *
 * Favorite
 *
 * Share
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.
 *
 * To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].
 *
 * To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
 *
 * Example 1:
 *
 * Input: [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 * Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
 * Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for(int[] a : A){
            for(int i = 0; i < a.length / 2; i++){
                int temp = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length-1-i] = temp;
            }

            for(int i = 0; i < a.length; i++){
                if(a[i] == 1){
                    a[i] = 0;
                }else{
                    a[i] = 1;
                }
            }
        }
        return A;
    }
}
