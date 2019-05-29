package com.algr0529;

import java.util.Arrays;

public class NextArray {
    public int maxDistToClosest(int[] seats) {
        int N = seats.length;
        int[] left = new int[N];
        int[] right = new int[N];

        Arrays.fill(left,N);
        Arrays.fill(right,N);

        for(int i = 0; i < left.length;i++){
            if(seats[i] == 1){
                left[i] = 0;
            }else if(i > 0){
                left[i] = left[i-1] + 1;
            }
        }

        for(int j = N-1;j >= 0;j--){
            if(seats[j] == 1){
                right[j] = 0;
            }else if(j < N-1){
                right[j] = right[j+1]+1;
            }
        }

        int ans = 0;
        for(int i = 0; i < seats.length; i++){
            ans = Math.max(ans,Math.min(left[i],right[i]));
        }
        return ans;
    }
}
