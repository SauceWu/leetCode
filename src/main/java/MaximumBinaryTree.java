import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/1/26 12:05
 */

class MaximumBinaryTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null)
            return t2;
        if (t2==null)
            return t1;
        TreeNode t = new TreeNode(t1.val + t2.val);
        t.left = mergeTrees(t1.left, t2.left);
        t.right = mergeTrees(t1.right, t2.right);
        return t;
    }

}
