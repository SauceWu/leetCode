/**
 * @author sauceWu .
 * @since 2018/1/8 12:34
 */

class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;


        ListNode sum_head = null;
        ListNode sum_tail = null;

        int carry = 0;

        while (l1 !=null && l2!=null) {
            int s = l1.val + l2.val + carry;
            carry = s / 10;
            int value = s % 10;

            if (sum_head == null) {
                sum_head = new ListNode(value);
                sum_tail = sum_head;
            } else {
                sum_tail.next = new ListNode(value);
                sum_tail = sum_tail.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode longest = null;
        if (l1 != null) {
            longest = l1;
        }
        else if (l2!= null) {
            longest = l2;
        }

        while (longest !=null) {
            int s = longest.val + carry;
            carry = s / 10;
            int value = s % 10;

            if (sum_head == null) {
                sum_head = new ListNode(value);
                sum_tail = sum_head;
            } else {
                sum_tail.next = new ListNode(value);
                sum_tail = sum_tail.next;
            }

            longest = longest.next;
        }

        if (carry != 0) {
            sum_tail.next = new ListNode(carry);
            return sum_head;
        }

        return sum_head;
    }
    private ListNode g(int[] src) {
        ListNode listNode = new ListNode(src[0]);
        ListNode tmp = listNode;
        for (int i = 1; i < src.length; i++) {
            tmp.next = new ListNode(src[i]);
            tmp = tmp.next;
        }
        return listNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder(String.valueOf(this.val) + "-");
            ListNode s = this.next;
            while (s != null) {
                sb.append(s.val).append('a');

                s = s.next;
            }

            return sb.toString();
        }
    }
}
