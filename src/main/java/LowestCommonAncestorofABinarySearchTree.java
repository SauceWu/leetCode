import bean.TreeNode;
import utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sauce
 * @since 2019-05-17
 */
public class LowestCommonAncestorofABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode res = root;
        List<TreeNode> fir = new ArrayList<>();
        List<TreeNode> sec = new ArrayList<>();
        getPath(root, p, fir);
        getPath(root, q, sec);
        System.out.println(ListUtils.List2String(fir));
        System.out.println(ListUtils.List2String(sec));
//        for (int i =  (Math.min(fir.size(), sec.size()) - 1); i >=0; i++) {
//            if (fir.get(i).val != sec.get(i).val) {
//                break;
//            }
//            res = fir.get(i);
//        }
        return res;
    }

    public boolean getPath(TreeNode root, TreeNode p, List<TreeNode> list) {
        if (root.val == p.val) {
            list.add(root);
            return true;
        } else if (root.val < p.val) {
            boolean is = getPath(root.right, p, list);
            if (is) {
                list.add(root);
            }
            return is;
        } else {
            boolean is = getPath(root.left, p, list);
            list.add(root);
            return is;
        }
    }

}
