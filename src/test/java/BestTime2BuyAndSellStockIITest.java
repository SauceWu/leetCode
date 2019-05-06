import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-06
 */
public class BestTime2BuyAndSellStockIITest {

    @Test
    public void maxProfit() {
        BestTime2BuyAndSellStockII bestTime2BuyAndSellStockIITest = new BestTime2BuyAndSellStockII();
        Assert.assertEquals(7, bestTime2BuyAndSellStockIITest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(4, bestTime2BuyAndSellStockIITest.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assert.assertEquals(0, bestTime2BuyAndSellStockIITest.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}