import bean.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-20
 */
public class LowestCommonAncestorOfABinaryTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> fir = new ArrayList<>();
        List<TreeNode> sec = new ArrayList<>();
        getPath(root, p, fir);
        getPath(root, q, sec);
        for (TreeNode treeNode : fir) {
            for (TreeNode node : sec) {
                if (treeNode.val == node.val)
                    return treeNode;
            }
        }
        return null;
    }


    private boolean getPath(TreeNode root, TreeNode p, List<TreeNode> list) {
        if (root == null) {
            return false;
        }
        if (root.val == p.val) {
            list.add(root);
            return true;
        }
        boolean is = getPath(root.right, p, list);
        if (!is) {
            is = getPath(root.left, p, list);
        }
        if (is)
            list.add(root);
        return is;
    }

}
