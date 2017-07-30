package crame.randall.Entity.AbilityScoreGenerator;

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
        int expected = asGen.standardGenerator().size();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void standardGeneratorValueTest(){
        int result = asGen.standardGenerator().get(0)[4];
        boolean expected = (result > 2 && result < 19);
        Assert.assertTrue(expected);
    }

    @Test
    public void classicGeneratorValueTest(){
        int result = asGen.classicGenerator().get(0)[3];
        boolean expected = (result > 2 && result < 19);
        Assert.assertTrue(expected);
    }

    @Test
    public void heroicGeneratorValueTest(){
        int result = asGen.heroicGenerator().get(0)[3];
        boolean expected = (result > 2 && result < 19);
        Assert.assertTrue(expected);
    }
}
