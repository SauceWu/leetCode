import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/1 11:51
 */
public class FindAllDuplicatesInAnArrayTest {

    @Test
    public void findDuplicates() {
        Assert.assertArrayEquals(new Integer[]{5,6}, new FindAllDuplicatesInAnArray().findDuplicates(new int[]{4,3,2,7,8,2,3,1}).toArray(new Integer[1]));

    }
}