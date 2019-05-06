/**
 * @author sauce
 * @since 2019-05-06
 */

public class BestTime2BuyAndSellStock {
    //    盈亏必然是 相邻两次价格的差值 排除亏的 就是盈利
    public int maxProfit(int[] prices) {
        int leng = prices.length;
        if (leng == 0) {
            return 0;
        }
        int result = 0, tmp = prices[0];
        for (int i = 1; i < leng; i++) {
            int dis = prices[i] - tmp;
            if (dis < 0) {
                tmp = prices[i];
            }
            if (dis > 0 && dis > result) {
                result = dis;
            }
        }
        return result;
    }


}
