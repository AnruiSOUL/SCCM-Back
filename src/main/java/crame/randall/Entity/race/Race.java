package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.AbilityScore;
import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;
import java.util.Map;

public abstract class Race {

    protected String race;
    protected Size size;
    protected Speed speed;
    protected ArrayList<Traits> racialTraits;
    protected ArrayList<String> racialLanguages;

    Race() {
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public ArrayList<Traits> getRacialTraits() {
        return racialTraits;
    }

    public void setRacialTraits(ArrayList<Traits> racialTraits) {
        this.racialTraits = racialTraits;
    }

    public ArrayList<String> getRacialLanguages() {
        return racialLanguages;
    }

    public void setRacialLanguages(ArrayList<String> racialLanguages) {
        this.racialLanguages = racialLanguages;
    }

    public abstract ArrayList<String> listRacialLanguages();

    public abstract ArrayList<Traits> listRacialTraits();

    public abstract void adjustRacialAbilityScores(CharacterScores characterScores);
}
