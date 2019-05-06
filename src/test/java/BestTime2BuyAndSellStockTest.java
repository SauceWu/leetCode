import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-06
 */
public class BestTime2BuyAndSellStockTest {

    @Test
    public void maxProfit() {
        BestTime2BuyAndSellStock bestTime2BuyAndSellStockIITest = new BestTime2BuyAndSellStock();
        Assert.assertEquals(5, bestTime2BuyAndSellStockIITest.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, bestTime2BuyAndSellStockIITest.maxProfit(new int[]{7,6,4,3,1}));
    }
}