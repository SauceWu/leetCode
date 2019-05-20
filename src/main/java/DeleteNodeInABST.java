import bean.TreeNode;

/**
 * @author sauce
 * @since 2019-05-17
 */
public class DeleteNodeInABST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            // 待删除节点在左子树中
            root.left = deleteNode(root.left, key);
            return root;
        } else if (key > root.val) {
            // 待删除节点在右子树中
            root.right = deleteNode(root.right, key);
            return root;
        } else {
            if (root.left == null) {
                // 返回右子树作为新的根
                return root.right;
            } else if (root.right == null) {
                // 返回左子树作为新的根
                return root.left;
            } else {
                // 左右子树都存在，返回后继节点（右子树最左叶子）作为新的根
                TreeNode successor = min(root.right);
                successor.right = deleteMin(root.right);
                successor.left = root.left;
                return successor;
            }
        }
    }

    private TreeNode min(TreeNode node) {
        if (node.left == null) {
            return node;
        }
        return min(node.left);
    }

    private TreeNode deleteMin(TreeNode node) {
        if (node.left == null) {
            return node.right;
        }
        node.left = deleteMin(node.left);
        return node;
    }

//    final PriorityQueue<Integer> q ;
//    final int k ;
//    public KthLargest(int k, int[] nums) {
//        this.k = k ;
//        q = new PriorityQueue<>(k);
//        for(int i : nums ){
//            add(i);
//        }
//    }
//
//    public int add(int n) {
//        // 返回第K大的数字
//        if(q.size() < k ){
//            q.offer(n);
//        }else if(q.peek() < n) {
//            q.poll();
//            q.offer(n);
//        }
//        return q.peek();
//    }
}
