import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauce
 * @since 2019-05-07
 */
public class BestTime2BuyAndSellStockIIITest {

    @Test
    public void maxProfit() {
        BestTime2BuyAndSellStockIII bestTime2BuyAndSellStockIV = new BestTime2BuyAndSellStockIII();
        Assert.assertEquals(15, bestTime2BuyAndSellStockIV.maxProfit(new int[]{1, 2, 3, 4, 5, 6, 5, 8, 1, 9,}));
//        Assert.assertEquals(2, bestTime2BuyAndSellStockIV.maxProfit(2, new int[]{2, 4, 1}));
    }
}