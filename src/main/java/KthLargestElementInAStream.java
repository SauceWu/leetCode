import bean.TreeNode;

import java.util.Base64;
import java.util.PriorityQueue;

/**
 * @author sauce
 * @since 2019-05-17
 */
public class KthLargestElementInAStream {
    class KthLargest {
        private int index;
        private TreeNode head;

        public KthLargest(int k, int[] nums) {
            this.index = k;
            head = new TreeNode(nums[0]);
            for (int i = 1; i < nums.length; i++) {
                insert(head, nums[i]);
            }
        }

        private void insert(TreeNode root, int val) {
            if (root.val > val) {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                } else {
                    insert(root.right, val);
                }
            } else {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                } else {
                    insert(root.left, val);
                }
            }
        }

        private int i = 0;

        private int searTree(TreeNode treeNode) {
            searTree(treeNode.left);
            if (++i < index) {
                return treeNode.val;
            }
            searTree(treeNode.right);
            return -1;
        }

        public int add(int val) {
            i = 0;
            insert(head, val);
            return searTree(head);
        }
    }
}
