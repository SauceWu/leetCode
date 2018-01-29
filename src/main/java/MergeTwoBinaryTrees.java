import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2017/12/18 16:53
 */

class MergeTwoBinaryTrees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode tmp = t1;
        TreeNode tmp2 = t2;
        tmp.val = tmp.val + tmp2.val;
        while (tmp.left.val == 0 && tmp2.left.val == 0) {
            tmp = tmp.left;
            tmp2 = tmp2.left;
            tmp.val = tmp.val + tmp2.val;
            while (tmp.right.val == 0 && tmp2.right.val == 0) {
                tmp = tmp.right;
                tmp2 = tmp2.right;
                tmp.val = tmp.val + tmp2.val;
            }
        }
        return tmp;
    }



}
