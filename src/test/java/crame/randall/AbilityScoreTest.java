package crame.randall;

import crame.randall.Entity.CharacterScore.Charisma;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by randallcrame on 3/23/17.
 */
public class AbilityScoreTest {
    Charisma test = new Charisma(18);
    @Before
    public void setUp(){
    }

    @Test
    public void AbilityScoreCharismaTest() {
        int expected = 18;
        int actual = test.getAbilityScore();
        Assert.assertEquals("Expected to be 18", expected, actual );
    }

    @Test
    public void BonusScoreTest() {
        int expected = 4;
        int actual = test.getAbilityModifier();
        Assert.assertEquals("Expected to be 4", expected, actual );
    }

    @Test
    public void BonusScoreNegativeTest() {
        test.setAbilityScore(3);
        int expected = -3;
        int actual = test.getAbilityModifier();
        Assert.assertEquals("Expected to be 4", expected, actual );
    }
}
