import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class maximalSquareTest {

    @Test
    public void maximalSquare() {
        int result = new MaximalSquare().maximalSquare(new char[][]{new char[]{'1', '0', '1', '0', '0'}, new char[]{'1', '0', '1', '1', '1'}, new char[]{'1', '1', '1', '1', '1'}, new char[]{'1', '0', '0', '1', '0'}});
        Assert.assertEquals(4, result);
    }
}