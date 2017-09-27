package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;
import java.util.Map;

public abstract class Race {
    protected Size size;
    protected Speed speed;
    protected ArrayList<Traits> racialTraits;
    protected Map<AbilityScore, Integer> racialAbilityAdjustments;
    protected ArrayList<String> racialLanguages;

    Race() {
    }

    public abstract ArrayList<String> listRacialLanguages();

    public abstract Map<AbilityScore,Integer> listAbilityAdjustments();

    public abstract ArrayList<Traits> listRacialTraits();
}
