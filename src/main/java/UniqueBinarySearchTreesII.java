import bean.TreeNode;
import utils.ListUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-15
 */
public class UniqueBinarySearchTreesII {
    public static void main(String[] args) {
        UniqueBinarySearchTreesII s = new UniqueBinarySearchTreesII();
        System.out.println(ListUtils.List2String(s.generateTrees(3)));
    }

    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<>();
        }
        return generateTrees(1, n);
    }

    public List<TreeNode> generateTrees(int left, int right) {
        List<TreeNode> res = new LinkedList<>();
        if (left > right) {
            res.add(null);
            return res;
        }
        for (int i = left; i <= right; i++) {
            List<TreeNode> leftList = generateTrees(left, i - 1);
            List<TreeNode> rightList = generateTrees(i + 1, right);
            for (TreeNode leftTree : leftList) {
                for (TreeNode rightTree : rightList) {
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left = leftTree;
                    treeNode.right = rightTree;
                    res.add(treeNode);
                }
            }
        }
        return res;
    }

}
