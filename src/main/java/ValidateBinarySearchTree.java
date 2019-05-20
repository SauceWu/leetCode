import bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-15
 */
public class ValidateBinarySearchTree {
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left) || (prev != null && root.val <= prev.val)) return false;
        prev = root;
        return isValidBST(root.right);
    }
}
