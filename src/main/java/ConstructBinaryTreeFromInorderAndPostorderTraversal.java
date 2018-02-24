import org.jetbrains.annotations.Nullable;

import java.util.HashMap;

import bean.TreeNode;

/**
 * l
 *
 * @author sauceWu .
 * @since 2018/2/24 15:37
 */

class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || inorder.length == 0 || postorder == null || postorder.length == 0 || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);
        return helper(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }


    @Nullable
    private TreeNode helper(int[] inorder, int il, int ir, int[] postorder, int pl, int pr, HashMap<Integer, Integer> map) {
        if (il > ir || pl > pr)
            return null;
        TreeNode root = new TreeNode(postorder[pr]);
        int index = map.get(postorder[pr]);
        root.left = helper(inorder, il, index - 1, postorder, pl, index - ir + pr - 1, map);
        root.right = helper(inorder, index + 1, ir, postorder, pl, pr - 1, map);
        return root;
    }
}
