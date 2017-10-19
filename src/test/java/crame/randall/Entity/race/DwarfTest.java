package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.CharacterScore.Constitution;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DwarfTest {

    Race charRace;

    @Before
    public void setUp(){
        charRace = new Dwarf();
    }
    @Test
    public void listRacialLanguagesTest() throws Exception {
        String actual = "List of  Languages";
        String expected = charRace.listRacialTraits().toString();
        assertEquals(actual, expected);

    }

    @Test
    public void listAbilityAdjustmentsValuesTest() throws Exception {
        String actual = "[2, 2, -2]"  ;
        String expected = charRace.listAbilityAdjustments().values().toString();
        assertEquals(actual, expected);
    }

    @Test
    public void listAbilityAdjustmentsKeysTest() throws Exception {
        Map expected = charRace.racialAbilityAdjustments;
        assertTrue(expected.containsKey(Constitution()));
    }

    @Test
    public void listRacialTraitsTest() throws Exception {
    }

}