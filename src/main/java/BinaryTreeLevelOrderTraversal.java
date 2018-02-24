import java.util.LinkedList;
import java.util.List;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 18:28
 */

class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new LinkedList<>();
        order(res,root,0);
        return res;
    }
    private void order(List<List<Integer>> res,TreeNode root,int depth){
        if(root==null){
            return;
        }
        if(res.size()<=depth){
            res.add(new LinkedList<>());
        }
        List<Integer> c=res.get(depth);

        c.add(root.val);
        order(res,root.left,depth+1);
        order(res,root.right,depth+1);
    }
}
