/**
 * @author sauce
 * @since 2019-05-06
 */

public class BestTime2BuyAndSellStockII {
    //    盈亏必然是 相邻两次价格的差值 排除亏的 就是盈利
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }


}
