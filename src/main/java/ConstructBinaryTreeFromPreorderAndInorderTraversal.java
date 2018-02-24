import java.util.HashMap;

import bean.TreeNode;

/**
 * @author sauceWu .
 * @since 2018/2/24 17:01
 */

class ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
    }

    private TreeNode helper(int[] preorder, int pl, int pr, int[] inorder, int il, int ir, HashMap<Integer, Integer> map) {
        if (pl>pr||il>ir)
            return null;
        TreeNode root = new TreeNode(preorder[pl]);
        int index=map.get(preorder[pl]);
//       子节点的数是一定的 index-il +pl 能找到分界点
        root.left=helper(preorder,pl+1,index-il+pl,inorder,il,index-1,map);
        root.right=helper(preorder,pl+index-il+1,pr,inorder,index+1,ir,map);

        return root;
    }
}
