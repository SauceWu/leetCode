import java.util.LinkedList;
import java.util.List;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 18:25
 */

class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new LinkedList<>();
        traversal(res,root);
        return res;
    }
    private void  traversal( List<Integer> res,TreeNode root){
        if(root==null)
            return;
        traversal(res,root.left);
        res.add(root.val);
        traversal(res,root.right);
    }
}
