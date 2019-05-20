/**
 * @author sauce
 * @since 2019-05-06
 */

public class BestTime2BuyAndSellStockIII {
    /*
     * 采用DP方式解题
     * 构建模型最重要是相关性
     *
     * */
    public int maxProfit(int[] prices) {
        int result = 0, firSell = 0;//最终利润；
        int firBuy = Integer.MIN_VALUE, secBuy = Integer.MIN_VALUE;// 将购买时价格调制最低保证 先购买后出售
        //DP 是将每一步最优化 SO 对于源只需要一次遍历 顺序遍历不会产生先
//总结下实际上 F（n）=f(n)+price ;  f(n)=F(n-1)-price; F为卖出后余额 f为买入后余额
//换成 二维数组   F [n][1]=F[n][0]+price ,f[N][0]=f[n-1]-price;
        for (int price : prices) {
            //实际上这个算法是从结果倒退出来的模型
            firBuy = Math.max(firBuy, -price);//第一次卖出后的余额= - 当前价格（如果增长则交易）
            firSell = Math.max(firSell, firBuy + price);//第一次卖出后的余额=第二次购买后的余额 + 当前价格（如果增长则交易）
            secBuy = Math.max(secBuy, firSell - price);//=第二次购买后的余额= 第一次卖出后的余额- 当前价（如果增长则交易）
            result = Math.max(result, secBuy + price);//最终利益相=第二次购买后的余额 + 当前价格（如果增长则交易）
//            System.out.printf("当前 价格-》 %s firBuy->%s firSell->%s firSell->%s firSell->%s \n", price, firBuy, firSell, secBuy, result);
        }
        return result;
    }
}