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
            if (res.get(depth) < root.getVal()) {
                res.set(depth, root.getVal());
            }
        } else {
            res.add(root.getVal());
        }
        if (root.getLeft() != null) findBottomLeftValue(root.getLeft(), depth + 1, res);
        if (root.getRight() != null) findBottomLeftValue(root.getRight(), depth + 1, res);
    }
}
