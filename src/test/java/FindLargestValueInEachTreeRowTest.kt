import bean.TreeNode
import org.junit.Assert
import org.junit.Test

/**
 * @author sauceWu .
 * @since 2018/2/13 16:07
 */
class FindLargestValueInEachTreeRowTest {

    @Test
    fun largestValues() {
        Assert.assertArrayEquals(intArrayOf(1, 3, 9),FindLargestValueInEachTreeRow()
                .largestValues(TreeNode(1, TreeNode(3, TreeNode(5), TreeNode(3)),TreeNode(2,null,TreeNode(9)))).toIntArray())
    }
}