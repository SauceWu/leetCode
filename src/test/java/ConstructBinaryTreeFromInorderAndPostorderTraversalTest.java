import org.junit.Assert;
import org.junit.Test;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 15:37
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    @Test
    public void buildTree() {
        Assert.assertEquals("[3,9,20,null,null,15,7]",
                TreeNode.treeNodeToString(new ConstructBinaryTreeFromInorderAndPostorderTraversal()
                        .buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3})));
    }
}