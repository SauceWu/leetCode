import java.util.ArrayList;
import java.util.List;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 17:38
 */

class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();

        child(list,root);
        return list;
    }
    private void  child( List<Integer> list,TreeNode root){
        if(root==null)
            return;
        list.add(root.val);

        child(list,root.left);
        child(list,root.right);
    }
}
