package com.algr0521;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int R = matrix.length;
        int C = matrix[0].length;

        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                int t = matrix[R-1][j];
                int t2 = matrix[j][C-1];
                int val = matrix[R-1][j-1];
                System.out.println(val);
            }
        }
        return false;
    }
}
