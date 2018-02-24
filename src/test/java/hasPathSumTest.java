import org.junit.Assert;
import org.junit.Test;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 11:41
 */
public class hasPathSumTest {

    @Test
    public void hasPathSum() {
        Assert.assertEquals(true,new PathSum().hasPathSum(TreeNode.stringToTreeNode("[5,4,8,11,null,13,4,7,2,null,null,null,1]"),22));
    }
}