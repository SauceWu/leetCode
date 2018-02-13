import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2017/12/18 16:53
 */

class MergeTwoBinaryTrees {


    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode tmp = t1;
        TreeNode tmp2 = t2;
        tmp.setVal(tmp.getVal() + tmp2.getVal());
        while (tmp.getLeft().getVal() == 0 && tmp2.getLeft().getVal() == 0) {
            tmp = tmp.getLeft();
            tmp2 = tmp2.getLeft();
            tmp.setVal(tmp.getVal() + tmp2.getVal());
            while (tmp.getRight().getVal() == 0 && tmp2.getRight().getVal() == 0) {
                tmp = tmp.getRight();
                tmp2 = tmp2.getRight();
                tmp.setVal(tmp.getVal() + tmp2.getVal());
            }
        }
        return tmp;
    }


}
