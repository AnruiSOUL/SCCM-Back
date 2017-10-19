package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.*;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Dwarf extends Race {

    public Dwarf(){
        this.race = "Dwarf";
        this.size = Size.MEDIUM;
        this.speed = new Speed(20);
        this.racialLanguages = listRacialLanguages();
        this.racialTraits = listRacialTraits();
    }

    public ArrayList<String> listRacialLanguages() {
        return null;
    }


    public void adjustRacialAbilityScores(CharacterScores characterScores) {
        characterScores.adjustAbilityScore(characterScores.getCON(), 2);
        characterScores.adjustAbilityScore(characterScores.getWIS(), 2);
        characterScores.adjustAbilityScore(characterScores.getCHA(), -2);
    }

    public ArrayList<Traits> listRacialTraits() {
        return null;
    }
}
