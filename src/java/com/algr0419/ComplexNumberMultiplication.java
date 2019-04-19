package com.algr0419;

public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String a, String b) {
        a = a.substring(0,a.length()-1);
        b = b.substring(0,b.length()-1);
        String[] arrA = a.split("\\+");
        String[] arrB = b.split("\\+");

        int mi = Integer.valueOf(arrA[0]) * Integer.valueOf(arrB[1]) + Integer.valueOf(arrA[1]) * Integer.valueOf(arrB[0]);

        int n = Integer.valueOf(arrA[0]) * Integer.valueOf(arrB[0]);
        int ii = Integer.valueOf(arrA[1]) * Integer.valueOf(arrB[1]);

        int diff = n - ii;
        String sign = "";
        String res = diff+"+"+sign+mi+"i";
        return res;
    }
}
