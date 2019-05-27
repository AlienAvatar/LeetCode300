package com.algr0526;

public class FibonacciNumber {
    public int fib(int N) {
        if(N == 0){
            return 0;
        }
        if(N == 1){
            return 1;
        }
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i < N; i++){
            b = a + b;
            a = b - a;
            sum = b;
        }
        return sum;
    }
}
