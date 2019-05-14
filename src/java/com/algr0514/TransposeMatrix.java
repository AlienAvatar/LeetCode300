package com.algr0514;

public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        int R = A.length;
        int C = A[0].length;
        int[][] arr = new int[C][R];

        for(int i= 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                arr[j][i] = A[i][j];
            }
        }
        return arr;
    }
}
