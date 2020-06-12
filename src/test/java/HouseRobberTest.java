import bean.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {

    @Test
    public void rob() {
        Assert.assertEquals(4, new HouseRobber().rob(new int[]{1, 2, 3, 1}));

    }
}