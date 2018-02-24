import java.util.ArrayList;
import java.util.List;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/13 16:00
 */

class FindLargestValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        findBottomLeftValue(root, 0, res);
        return res;
    }

    public void findBottomLeftValue(TreeNode root, int depth, List<Integer> res) {
        if (res.size() > depth) {
            if (res.get(depth) < root.val) {
                res.set(depth, root.val);
            }
        } else {
            res.add(root.val);
        }
        if (root.left != null) findBottomLeftValue(root.left, depth + 1, res);
        if (root.right != null) findBottomLeftValue(root.right, depth + 1, res);
    }
}
