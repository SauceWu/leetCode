import bean.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauce
 * @since 2019-05-10
 */
public class SwapNodesInPairsTest {

    @Test
    public void swapPairs() {
        Assert.assertEquals("[2,1,4,3]", ListNode.listNodeToString(new SwapNodesInPairs().swapPairs(ListNode.stringToListNode("[1,2,3,4]"))));
    }
}