package com.algr0516;

public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean check = true;
        for(int i = 0; i < A.length-1; i++){
            if(A[i] <= A[i+1]){
                continue;
            }else{
                check = false;
            }
        }
        if(check){
            return true;
        }else{
            for(int i = 0; i < A.length-1; i++){
                if(A[i] >= A[i+1]){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
