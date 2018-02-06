import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/1 11:21
 */
public class IslandPerimeterTest {

    @Test
    public void islandPerimeter() {
        Assert.assertEquals(16, new IslandPerimeter().islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}}));
        Assert.assertEquals(6, new IslandPerimeter().islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}}));
    }
}