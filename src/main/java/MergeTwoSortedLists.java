import bean.ListNode;

/**
 * @author sauce
 * @since 2019-05-14
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }
        if (l1.val > l2.val) {
            return mergeTwoLists(l2, l1);
        }
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    }


}
