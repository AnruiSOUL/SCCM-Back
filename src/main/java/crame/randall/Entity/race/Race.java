package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;

public abstract class Race {
    protected Size size;
    protected Speed speed;
    protected ArrayList<Traits> racialTraits;
    protected ArrayList<AbilityScore> racialAbilityAdjustments;
    protected ArrayList<String> racialLanguages;

    Race() {
    }

    public abstract ArrayList<String> listRacialLanguages();

    public abstract ArrayList<AbilityScore> listAbilityAdjustments();

    public abstract ArrayList<Traits> listRacialTraits();
}
