package com.algr0522;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (j > 0 && i > 0 && matrix[i][j] != matrix[i-1][j-1]) {
                   return false;
                }
            }
        }
        return true;
    }
}
