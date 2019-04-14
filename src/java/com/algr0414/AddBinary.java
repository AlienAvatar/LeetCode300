package com.algr0414;

/**
 * Given two binary strings, return their sum (also a binary string).
 *
 * The input strings are both non-empty and contains only characters 1 or 0.
 *
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class AddBinary {
    /**
     * 我的思路1.转换为Integer，进行计算后，又转换为String
     * Runtime Error
     * @param a
     * @param b
     * @return
     */
    public String addBinary(String a, String b) {
        int re = Biannary2Decimal(Integer.parseInt(a)) + Biannary2Decimal(Integer.parseInt(b));
        String str = Decimal2Binary(re);
        return str;
    }

    public  static  Integer Biannary2Decimal(int bi){
        String binStr = bi+"";
        Integer sum = 0;
        int len = binStr.length();
        for (int i=1;i<=len;i++){
            //第i位 的数字为：
            int dt = Integer.parseInt(binStr.substring(i-1,i));
            sum+=(int)Math.pow(2,len-i)*dt;
        }
        return  sum;
    }

    public static String Decimal2Binary(int de){
        String numstr = "";
        while (de>0){
            int res = de%2; //除2 取余数作为二进制数
            numstr = res + numstr;
            de = de/2;
        }
        return  numstr;
    }

    /**
     * a = "1010", b = "1011"
     * @param a
     * @param b
     * @return
     */
    public String addBinary2(String a, String b) {
        if(a.length() < b.length()){
            String tmp = a;
            a = b;
            b = tmp;
        }

        int pa=a.length()-1;
        int pb=b.length()-1;
        String res="";
        int carries=0;

        while(pb>=0){
            int sum = (int)(a.charAt(pa)-'0') + (int)(b.charAt(pb)-'0')+carries;
            res=(String.valueOf(sum%2))+res;
            carries=sum/2;
            pa--;
            pb--;
        }

        while(pa>=0){
            int sum = (int)(a.charAt(pa)-'0');
            res=(String.valueOf(sum%2))+res;
            carries=sum/2;
            pa--;
        }

        if(carries == 1){
            res = "1" + res;
        }

        return res;
    }

}
