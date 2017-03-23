package crame.randall;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static crame.randall.model.abilityscore.AbilityScore.STR;

/**
 * Created by randallcrame on 3/23/17.
 */
public class AbilityScoreTest {

    @Before
    public void setUp(){
        STR.setScore(18);
    }

    @Test
    public void AbilityScoreTest() {
        int expected = 18;
        int actual = STR.getScore();
        Assert.assertEquals("Expected STR enum to be 18", expected, actual );
    }
}
