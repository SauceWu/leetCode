import bean.TreeLinkNode;

/**
 * @author sauceWu .
 * @since 2018/2/26 12:20
 */

class PopulatingNextRightPointersInEachNode {
    public void connect(TreeLinkNode root) {
        if (root == null)
            return;
        if (root.left != null) {
            root.left = root.right;
            if (root.next!= null)
                root.right.next =root.next.left;
        }
        connect(root.left);
        connect(root.right);

    }

}
