package crame.randall.Entity.AbilityScoreGenerator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointBuyTest {
    PointBuy pointBuy;

    @Before
    public void setUp(){
        pointBuy = new PointBuy();
    }

    @Test
    public void setPoolByCampaignLowType() {
        pointBuy.setPoolByCampaignType("low");
        int expected = 10;
        int actual = pointBuy.getPointPool();
        assertEquals(expected,actual);
    }

    @Test
    public void setPoolByCampaignStandardType() {
        pointBuy.setPoolByCampaignType("standard");
        int expected = 15;
        int actual = pointBuy.getPointPool();
        assertEquals(expected,actual);
    }

    @Test
    public void setPoolByCampaignHighType() {
        pointBuy.setPoolByCampaignType("high");
        int expected = 20;
        int actual = pointBuy.getPointPool();
        assertEquals(expected,actual);
    }

    @Test
    public void setPoolByCampaignEpicType() {
        pointBuy.setPoolByCampaignType("epic");
        int expected = 25;
        int actual = pointBuy.getPointPool();
        assertEquals(expected,actual);
    }

    @Test
    public void setPoolByCampaignCustomType() {
        pointBuy.setPoolByCampaignType("300");
        int expected = 300;
        int actual = pointBuy.getPointPool();
        assertEquals(expected,actual);
    }



}