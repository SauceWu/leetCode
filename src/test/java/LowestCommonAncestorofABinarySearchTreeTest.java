import bean.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-17
 */
public class LowestCommonAncestorofABinarySearchTreeTest {

    @Test
    public void lowestCommonAncestor() {
        LowestCommonAncestorofABinarySearchTree test = new LowestCommonAncestorofABinarySearchTree();
        Assert.assertEquals(6, test.lowestCommonAncestor(TreeNode.stringToTreeNode("[6,2,8,0,4,7,9,null,null,3,5]"), new TreeNode(2), new TreeNode(4)).val);
    }
}