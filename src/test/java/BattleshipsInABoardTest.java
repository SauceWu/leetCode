import org.junit.Assert;
import org.junit.Test;

/**
 * @author sauceWu .
 * @since 2018/2/1 11:38
 */
public class BattleshipsInABoardTest {

    @Test
    public void countBattleships() {
        Assert.assertEquals(2, new BattleshipsInABoard().countBattleships(new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}}));

    }
}