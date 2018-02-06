import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 17:53
 */
public class ToeplitzMatrixTest {

    @Test
    public void isToeplitzMatrix() {
        Assert.assertEquals(true, new ToeplitzMatrix().isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
        Assert.assertEquals(false, new ToeplitzMatrix().isToeplitzMatrix(new int[][]{{1, 2}, {1, 2}}));
        Assert.assertEquals(false, new ToeplitzMatrix().isToeplitzMatrix(new int[][]{{11,74,0,93},{40,11,74,7}}));

    }
}