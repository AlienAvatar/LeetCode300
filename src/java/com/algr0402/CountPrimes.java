package com.algr0402;

public class CountPrimes {

    /**
     * Time Limit Exceeded
     * @param n
     * @return
     */
    public int countPrimes(int n) {
        int count = 0;
        for(int i = 2; i < n; i++){
            if(checkPrimes(i)){
               count++;
            }
        }
        return count;
    }

    public boolean checkPrimes(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public int countPrimes2(int n){
        boolean[] notPrimes = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(notPrimes[i] == false){
                count++;
                for(int j = 2; i*j < n; j++){
                    notPrimes[i*j] = true;
                }
            }
        }
        return count;
    }

}
