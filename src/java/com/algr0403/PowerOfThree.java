package com.algr0403;

public class PowerOfThree {
    /**
     * Memory Limit Exceeded
     * @param n
     * @return
     */
    public boolean isPowerOfThree(int n) {
        boolean[] check = new boolean[n+1];
        for(int i = 1; i <= n; i *=3){
            if(check[i] == false){
                check[i] = true;
            }
        }
        return check[n];
    }

    /**
     * Time Limit Exceeded
     * @param n
     * @return
     */
    public boolean isPowerOfThree2(int n) {
        n = Math.abs(n);
        int num = 1;
        while(num <= n){
            if(n == num){
                return true;
            }
            num *= 3;
        }
        return false;
    }

    public boolean isPowerOfThree3(int n){
        if(n < 1){
            return false;
        }
        while(n % 3 == 0){
            n /= 3;
        }
        return n==1;
    }
}
