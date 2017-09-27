package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;

public class Dwarf extends Race {

    public Dwarf(){
        this.size = Size.MEDIUM;
        this.speed = new Speed(20);
        this.racialTraits = listRacialTraits();
        this.racialAbilityAdjustments = listAbilityAdjustments();
        this.racialLanguages = listRacialLanguages();
    }

    public ArrayList<String> listRacialLanguages() {
        return null;
    }


    public ArrayList<AbilityScore> listAbilityAdjustments() {
        return null;
    }

    public ArrayList<Traits> listRacialTraits() {
        return null;
    }
}
