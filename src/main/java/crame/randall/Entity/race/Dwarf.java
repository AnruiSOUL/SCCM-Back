package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.CharacterScore.Charisma;
import crame.randall.Entity.CharacterScore.Constitution;
import crame.randall.Entity.CharacterScore.Wisdom;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


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


    public Map<AbilityScore,Integer> listAbilityAdjustments() {
        Map<AbilityScore,Integer> abilityAdjustments = new HashMap<>();
        abilityAdjustments.put(new Constitution(), 2);
        abilityAdjustments.put(new Wisdom(), 2);
        abilityAdjustments.put(new Charisma(), -2);
        return abilityAdjustments;
    }

    public ArrayList<Traits> listRacialTraits() {
        return null;
    }
}
