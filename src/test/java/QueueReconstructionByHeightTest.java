import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/31 17:49
 */
public class QueueReconstructionByHeightTest {

    @Test
    public void reconstructQueue() {
        Assert.assertArrayEquals(new int[][]{{5, 0}, {7, 0}, {5, 2}, {6, 1}, {4, 4}, {7, 1}}, new QueueReconstructionByHeight().reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}}));
    }
}