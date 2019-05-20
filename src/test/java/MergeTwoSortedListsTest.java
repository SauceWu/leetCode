import bean.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2019-05-14
 */
public class MergeTwoSortedListsTest {

    @Test
    public void mergeTwoLists() {
        Assert.assertEquals("[1,1,2,3,4,4]", ListNode.listNodeToString(new MergeTwoSortedLists().mergeTwoLists(ListNode.stringToListNode("[1,2,4]"), ListNode.stringToListNode("[1,3,4]"))));

    }
}