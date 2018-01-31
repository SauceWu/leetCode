import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/1/30 18:18
 */
public class PartitionLabelsTest {

    @Test
    public void partitionLabels() {
        Assert.assertArrayEquals(new Integer[]{9,7,8},new PartitionLabels().partitionLabels("ababcbacadefegdehijhklij"));
    }
}