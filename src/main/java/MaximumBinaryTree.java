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
        TreeNode t = new TreeNode(t1.getVal() + t2.getVal(),null,null);
        t.setLeft(mergeTrees(t1.getLeft(), t2.getLeft()));
        t.setRight(mergeTrees(t1.getRight(), t2.getRight()));
        return t;
    }

}
