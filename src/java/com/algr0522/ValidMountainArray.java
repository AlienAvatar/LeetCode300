package com.algr0522;

public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }
        int max = 0;
        for(int i = 0; i < A.length; i++){
            max = Math.max(max,A[i]);
        }
        int c = 0;
        for(int i = 0; i < A.length; i++){
            if(max == A[i]){
                c = i;
            }
        }
        if(c == A.length-1 || c == 0){
            return false;
        }
        for(int i = 0; i < c; i++){
            if(A[i] < A[i+1]){
                continue;
            }else{
                return false;
            }
        }
        for(int i = c; i < A.length-1; i++){
            if(A[i+1] < A[i]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
