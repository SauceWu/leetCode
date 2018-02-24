import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 18:31
 */

class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        maximum_depth(root,1);
        return answer;
    }
    private int answer;		// don't forget to initialize answer before call maximum_depth
    private void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }
}
