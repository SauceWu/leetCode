import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/31 17:01
 */
public class NextGreaterElementITest {

    @Test
    public void nextGreaterElement() {
        Assert.assertArrayEquals(new int[]{-1,3,-1},new NextGreaterElementI().nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2}));
        Assert.assertArrayEquals(new int[]{3,-1},new NextGreaterElementI().nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4}));

    }
}