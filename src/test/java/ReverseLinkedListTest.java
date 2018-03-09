import org.junit.Assert;
import org.junit.Test;

import bean.ListNode;

/**
 * @author sauceWu .
 * @since 2018/2/26 16:08
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        Assert.assertEquals("[2,1]",ListNode.listNodeToString(new ReverseLinkedList().reverseList(ListNode.stringToListNode("[1,2]"))));
    }
}