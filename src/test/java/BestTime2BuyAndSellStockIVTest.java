import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-07
 */
public class BestTime2BuyAndSellStockIVTest {

    @Test
    public void maxProfit() {
        BestTime2BuyAndSellStockIV bestTime2BuyAndSellStockIV = new BestTime2BuyAndSellStockIV();
        Assert.assertEquals(0, bestTime2BuyAndSellStockIV.maxProfit(3, new int[]{3,2, 3,4,5,6,5,7,8,9,1,9}));
//        Assert.assertEquals(2, bestTime2BuyAndSellStockIV.maxProfit(2, new int[]{2, 4, 1}));
    }
}