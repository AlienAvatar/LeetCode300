package com.algr0514;

/**
 * 63. Unique Paths II
 * Medium
 *
 * 830
 *
 * 111
 *
 * Favorite
 *
 * Share
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *
 * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *
 * Now consider if some obstacles are added to the grids. How many unique paths would there be?
 */
public class UniquePaths2 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int R = obstacleGrid.length;
        int C = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        obstacleGrid[0][0] = 1;
        for(int i = 1; i < R; i++){
            if(obstacleGrid[0][i] == 0 && obstacleGrid[0][i-1] == 1){
                obstacleGrid[0][i] = 1;
            }else{
                obstacleGrid[0][i] = 0;
            }
        }

        for(int j = 1; j < C; j++){
            if(obstacleGrid[j][0] == 0 && obstacleGrid[j-1][0] == 1){
                obstacleGrid[j][0] = 1;
            }else{
                obstacleGrid[j][0] = 0;
            }
        }

        for(int i = 1; i < R; i++){
            for(int j = 1; j < C; j++){
                if(obstacleGrid[i][j] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }else{
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        return obstacleGrid[R-1][C-1];
    }
}
