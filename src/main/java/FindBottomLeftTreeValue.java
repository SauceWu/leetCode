import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/8 15:38
 */

class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        return findBottomLeftValue(root, 1, new int[]{0, 0});
    }

    public int findBottomLeftValue(TreeNode root, int depth, int[] res) {
        if (res[1] < depth) {
            res[0] = root.getVal();
            res[1] = depth;
        }
        if (root.getLeft() != null) findBottomLeftValue(root.getLeft(), depth + 1, res);
        if (root.getRight() != null) findBottomLeftValue(root.getRight(), depth + 1, res);
        return res[0];
    }
}
