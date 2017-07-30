package crame.randall.Entity.AbilityScoreGenerator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointBuyTest {
    PointBuy pointBuy;
    int[] baseAblilityScores,variousAblilityScores;

    @Before
    public void setUp(){
        pointBuy = new PointBuy();
        baseAblilityScores = new int[]{10, 10, 10, 10, 10, 10};
        variousAblilityScores = new int[]{12, 12, 13, 7, 15, 18};

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

    @Test
    public void setCheckAbilityScoreCostDefaultTest(){
        int expected = 0;
        int actual = pointBuy.checkAbilityScoreCost(121);
        assertEquals(expected,actual);
    }

    @Test
    public void setCheckAbilityScoreCost10Test(){
        int expected = 0;
        int actual = pointBuy.checkAbilityScoreCost(10);
        assertEquals(expected,actual);
    }
    @Test
    public void setCheckAbilityScoreCost17Test(){
        int expected = 13;
        int actual = pointBuy.checkAbilityScoreCost(17);
        assertEquals(expected,actual);
    }

    @Test
    public void calculateAbilityScoreCostBaseTest(){
        pointBuy.setPoolByCampaignType("standard");
        int expected = 15;
        int actual = pointBuy.calculateAbilityScoreCost(baseAblilityScores);
        assertEquals(expected,actual);
    }

    @Test
    public void calculateAbilityScoreCostVariousTest(){
        pointBuy.setPoolByCampaignType("standard");
        int expected = -12;
        int actual = pointBuy.calculateAbilityScoreCost(variousAblilityScores);
        assertEquals(expected,actual);
    }
}