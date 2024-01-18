package maxProfit;

import java.util.Arrays;

public class maxProfit121 {
    public maxProfit121() {
    }

    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        if( prices == null || prices.length <=1){
            return 0;
        }
        for(int sell: Arrays.copyOfRange(prices, 1, prices.length)){
            if(sell > buy){
                profit = Math.max(profit, sell - buy);

            }else{
                buy = sell;
            }
        }

        return profit;

    }
}
