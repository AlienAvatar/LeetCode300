package com.algr0402;

import java.util.HashSet;

public class IsHappy {
    /**
     * Limit exceed
     * @param n
     * @return
     */
    public boolean isHappy(int n){
        int re = 0;

        while(re != 1){
            int div = 1;
            for(int i = 0; i < String.valueOf(n).length()-1;i++){
                div *= 10;
            }
            int a = n % div;
            int b = n / div;
            a = a*a;
            b = b*b;
            n = a + b;
            re = n;
        }
        if(re == 1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isHappy2(int n){
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
            n = getHappy(n);
        }
        return true;
    }

    private int getHappy(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }




}
