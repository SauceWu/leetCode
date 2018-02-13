import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/6 14:46
 */

class TrimABinarySearchTree {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return null;

        if (root.getVal() < L) return trimBST(root.getRight(), L, R);
        if (root.getVal() > R) return trimBST(root.getLeft(), L, R);

        root.setLeft(trimBST(root.getLeft(), L, R)) ;
        root.setRight(trimBST(root.getRight(), L, R));


        return root;
    }
}
