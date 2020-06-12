import org.junit.Assert;
import org.junit.Test;
import utils.ListUtils;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        Assert.assertEquals("[[-1, 0, 1],[-1, -1, 2]]", ListUtils.List2String(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4})));
    }
}