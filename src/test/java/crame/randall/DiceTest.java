package crame.randall;

import crame.randall.Entity.Dice.Dice;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class DiceTest {
    Dice dice;
    int d6, d20;

    @Before
    public void setUp() {
        dice = new Dice();
        d6 = Dice.roll(6);
        d20 = Dice.roll(20);
    }

    @Test
    public void rollTest() {
        boolean actual = (d6 < 7 && d6 > 0);
        Assert.assertTrue("Testing the call of dice will be less then 7", actual);
    }

    @Test
    public void multiRollTest() {
        int expected = 4;
        int actual = Dice.multiDiceRoll(4, 20).length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public  void multiRollValueTest() {
        int[] expected = {1,1,1,1};
        int[] actual = Dice.multiDiceRoll(4,1);
        Assert.assertArrayEquals(expected,actual);
    }
}

