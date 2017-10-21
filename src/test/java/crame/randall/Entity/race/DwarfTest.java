package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class DwarfTest {

    Race charRace;
    CharacterScores characterScores;

    @Before
    public void setUp(){
        charRace = new Dwarf();
        characterScores = new CharacterScores(new Strength(), new Dexterity(), new Constitution(14),
                                                new Intelligence(), new Wisdom(10), new Charisma(10));
    }

    @Test
    public void listRacialLanguagesTest() throws Exception {
        String actual = "List of  Languages";
        String expected = charRace.listRacialTraits().toString();
        assertEquals(actual, expected);

    }

    @Test
    public void adjustRacialAbilityScoresTest() throws Exception {
        charRace.adjustRacialAbilityScores(characterScores);
        assertTrue(characterScores.getCON().getAbilityScore() == 16);
        assertTrue(characterScores.getWIS().getAbilityScore() == 12);
        assertTrue(characterScores.getCHA().getAbilityScore() == 8);
    }

    @Test
    public void listRacialTraitsTest() throws Exception {
    }

}