/**
 * @author sauce
 * @since 2019-05-06
 */

public class BestTime2BuyAndSellStockIV {
    /*
     * 采用DP方式解题
     * 构建模型最重要是相关性
     *
     * */
    public int maxProfit(int k, int[] prices) {
        if (prices.length < 1 || k == 0) {
            return 0;
        }
        /*
         * 只是用DP 当 K 过大时 会内存溢出  （本身结果无问题）
         * 当k >prices （就是 实际上的获取利润已经不受交易次数的约束时）时采取贪心策略(只考虑最大收益就完事了) 也就是 II 里面使用的 扩展
         */
        if (k > prices.length / 2) {
            int result = 0;
            for (int i = 1; i < prices.length; ++i) {
                if (prices[i] > prices[i - 1])
                    result += prices[i] - prices[i - 1];
            }
            return result;
        }

        int[][] t = new int[k][2];
//        保证先买
        for (int i = 0; i < k; i++) {
            t[i][0] = Integer.MIN_VALUE;
        }
        for (int p : prices) {
            //初始化第一次价格
            t[0][0] = Math.max(t[0][0], -p);
            t[0][1] = Math.max(t[0][1], t[0][0] + p);
            //总结下实际上 F（n）=f(n)+price ;  f(n)=F(n-1)-price; F为卖出后余额 f为买入后余额
//换成 二维数组   F [n][1]=F[n][0]+price ,f[N][0]=f[n-1]-price;
            for (int i = 1; i < k; i++) {
                t[i][0] = Math.max(t[i][0], t[i - 1][1] - p);
                t[i][1] = Math.max(t[i][1], t[i][0] + p);
            }
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < t.length; i++) {
                sb.append(String.format("%dBuy->  %s | %dSell->  %s |", i, t[i][0], i, t[i][1]));
            }
            System.out.printf("当前 价格->  %s  %s\n", p, sb.toString());

        }
        return t[k - 1][1];
    }
}