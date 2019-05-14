package com.algr0512;

public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int len = (int)Math.sqrt(num);
        for(int i = 1; i <= len; i++){
            if(i * i == num){
                return true;
            }
        }
        return false;
    }
}
