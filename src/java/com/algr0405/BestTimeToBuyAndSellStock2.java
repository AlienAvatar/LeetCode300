package com.algr0405;

public class BestTimeToBuyAndSellStock2 {
    /*public int maxProfit(int[] prices) {
        return calculate(prices,0);
    }

    private int calculate(int[] prices,int start){
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            int maxprofit = 0;
            for(int j = i+1; i < prices.length; j++){
                int tmp = calculate(prices,start+1) + prices[j] - prices[i];
                if(tmp > maxprofit){
                    maxprofit = tmp;
                }
                if(maxprofit > max){
                    max = maxprofit;
                }
            }
        }
        return max;
    }*/

    public int maxProfit(int[] prices) {
        int sell = 0;
        int lastSell = 0;
        int rest = 0;
        for(int i = 0; i < prices.length - 1; i++){
            lastSell=sell;
            sell=Math.max(sell+prices[i+1]-prices[i],sell);
            rest = Math.max(lastSell,sell);
        }
        return rest;
    }
}
