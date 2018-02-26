package bean;

import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sauceWu .
 * @since 2018/2/26 12:20
 */

public class TreeLinkNode extends TreeNode {

    public TreeLinkNode left, right, next;

    public TreeLinkNode(int val) {
        super(val);
    }


    @NotNull
    public static String treeNodeToString(TreeLinkNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "";
        Queue<TreeLinkNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeLinkNode node = nodeQueue.remove();

            if (node == null) {
                output += "null,";
                continue;
            }

            output += String.valueOf(node.val) + ",";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
            nodeQueue.add(node.next);
        }
        return "[" + output.substring(0, output.length() - 3) + "]";
    }
}
