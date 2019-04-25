package com.algr0425;

/**
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 */
public class GoatLatin {
    public String toGoatLatin(String S) {
        String[] strs = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs.length; i++){
            String str = strs[i].toLowerCase();
            if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
                String temp = strs[i];
                temp += "ma";
                for(int j = 0; j <= i; j++){
                    temp += "a";
                }
                sb.append(temp+" ");
            }else{
                String temp = strs[i].substring(1,strs[i].length());
                temp += strs[i].charAt(0) + "ma";
                for(int j = 0; j <= i; j++){
                    temp += "a";
                }
                sb.append(temp+" ");
            }
        }
        String res = sb.toString();
        res = res.trim();

        return res;
    }
}
