import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sauce
 * @since 2018/3/22
 */
public class RotateStringTest {

    @Test
    public void rotateString() {
        Assert.assertEquals(true,new RotateStzring().rotateString("abcde","cdeab"));
        Assert.assertEquals(false,new RotateStzring().rotateString("abcde","abced"));

    }
}