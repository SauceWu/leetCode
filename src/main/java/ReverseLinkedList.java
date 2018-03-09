import bean.ListNode;

/**
 * @author sauceWu .
 * @since 2018/2/26 16:08
 */

class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return build(head, null);
    }

    private ListNode build(ListNode head, ListNode newHead) {
        if (head == null)
            return newHead;
        ListNode tmp = head.next;
        head.next = newHead;
        return build(tmp, head);
    }
}
