import bean.ListNode;
import bean.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-20
 */
public class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    public void lowestCommonAncestor() {
        Assert.assertEquals(3, new LowestCommonAncestorOfABinaryTree().lowestCommonAncestor(TreeNode.stringToTreeNode("[3,5,1,6,2,0,8,null,null,7,4]"), new TreeNode(5), new TreeNode(1)).val);
    }
}