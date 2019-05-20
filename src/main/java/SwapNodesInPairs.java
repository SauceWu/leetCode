import bean.ListNode;

/**
 * @author sauce
 * @since 2019-05-10
 */
public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        s(head);
        return head;
    }

    public ListNode s(ListNode head) {
        if (head.next != null) {
            int tmp = head.val;
            head.val = head.next.val;
            head.next.val = tmp;
            if (head.next.next != null) {
                s(head.next.next);
            }
        }
        return head;
    }
}
