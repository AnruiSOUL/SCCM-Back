package crame.randall;

import crame.randall.Entity.Dice.Dice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {
    Dice dice;
    int d6;

    @Before
    public void setUp() {
        dice = new Dice();
        d6 = Dice.roll(6);
    }

    @Test
    public void  rollTest(){
        boolean expected = true;
        boolean actual = (d6 < 7 && d6 > 0 );
        Assert.assertTrue("Testing the call of dice will be less then 7", actual);
    }
}
