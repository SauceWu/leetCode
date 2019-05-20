import bean.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author sauce
 * @since 2019-05-15
 */
public class BinarySearchTreeIterator {


    private class BSTIterator {
        private List<TreeNode> list = new LinkedList<>();
        private int index = 0;

        public BSTIterator(TreeNode root) {
            init(root);
        }

        private void init(TreeNode root) {
            if (root == null)
                return;
            init(root.left);
            list.add(root);
            init(root.right);
        }

        /**
         * @return the next smallest number
         */
        public int next() {
            index++;
            return list.get(index - 1).val;
        }

        /**
         * @return whether we have a next smallest number
         */
        public boolean hasNext() {
            return index < list.size();
        }
    }
}
