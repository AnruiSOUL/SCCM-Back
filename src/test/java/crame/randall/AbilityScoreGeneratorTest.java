package crame.randall;

import crame.randall.Entity.AbilityScoreGenerator.AbilityScoreGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AbilityScoreGeneratorTest {
    AbilityScoreGenerator asGen;

    @Before
    public void setUp(){
        asGen = new AbilityScoreGenerator();
    }

    @Test
    public void standardGeneratorTest(){
        int actual = 6;
        int expected = asGen.standardGenerator().length;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void standardGeneratorValueTest(){
        int result = asGen.standardGenerator()[0];
        boolean expected = (result > 2 && result < 19);
        Assert.assertTrue(expected);
    }
}
