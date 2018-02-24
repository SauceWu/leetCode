import java.util.ArrayList;
import java.util.List;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 11:41
 */

public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (sum == root.val && root.left == null && root.right == null)
            return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    private boolean sums(TreeNode root, int sum, int src) {
        List a =new ArrayList();
        a.toArray(new Integer[5]);
        if (root == null) {
            System.out.print(sum + "-");
            return sum == src;
        }
        sum += root.val;

        return sum <= src && (sums(root.left, sum, src) || sums(root.right, sum, src));
    }
}
