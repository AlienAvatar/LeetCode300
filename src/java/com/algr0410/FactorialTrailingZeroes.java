package com.algr0410;

public class FactorialTrailingZeroes {
    /*public int trailingZeroes(int n) {
        if(n <= 1){
            return 0;
        }
        int sum = 1;
        for(int i = n; i > 0; i--){
            sum *= i;
        }

        int count = 0;
        while(sum != 0){
            int check = sum % 10;
            if(check == 0){
                count++;
            }else{
                return count;
            }
            sum /= 10;
        }
        return count;
    }*/

    public int trailingZeroes(int n) {
        if (n >= 5) {
            return n / 5 + trailingZeroes (n / 5);
        } else {
            return 0;
        }
    }
}
