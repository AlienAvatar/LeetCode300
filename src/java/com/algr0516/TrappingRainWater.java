package com.algr0516;

public class TrappingRainWater {
    public int trap(int[] height) {
        int area = 0;
        int len = height.length;
        for(int i = 1; i < height.length-1;i++){
            int max_left = 0, max_right = 0;
            for(int j = i; j >= 0; j--){
                max_left = Math.max(max_left,height[j]);
            }
            for(int j = i; j < len;j++){
                max_right = Math.max(max_right,height[j]);
            }
            area += Math.min(max_left,max_right)-height[i];
        }
        return area;
    }
}
