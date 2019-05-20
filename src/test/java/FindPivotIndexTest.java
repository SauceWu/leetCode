import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-09
 */
public class FindPivotIndexTest {

    @Test
    public void pivotIndex() {
        Assert.assertEquals(3, new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        Assert.assertEquals(-1, new FindPivotIndex().pivotIndex(new int[]{1, 2, 3}));
//        Assert.assertEquals(-1, new FindPivotIndex().pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
    }
}