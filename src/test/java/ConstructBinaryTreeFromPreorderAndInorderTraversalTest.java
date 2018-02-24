import org.junit.Assert;
import org.junit.Test;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 17:02
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

    @Test
    public void buildTree() {
        Assert.assertEquals("[3,9,20,null,null,15,7]",
                TreeNode.treeNodeToString(new ConstructBinaryTreeFromPreorderAndInorderTraversal()
                        .buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7})));
    }
}