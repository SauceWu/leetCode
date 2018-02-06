import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 17:21
 */
public class ReshapeTheMatrixTest {

    @Test
    public void matrixReshape() {
        Assert.assertArrayEquals(new int[][]{{1, 2, 3, 4}}, new ReshapeTheMatrix().matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
    }
}