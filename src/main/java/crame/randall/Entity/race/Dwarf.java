package crame.randall.Entity.race;

import crame.randall.Entity.CharacterScore.*;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;



public class Dwarf extends Race {

    public Dwarf(){
        this.race = "Dwarf";
        this.size = Size.MEDIUM;
        this.speed = new Speed(20);
        this.racialLanguages = listRacialLanguages();
        this.racialTraits = listRacialTraits();
    }

    protected ArrayList<String> listRacialLanguages() {
        ArrayList<String> dwarfLanguages = new ArrayList<>();
        dwarfLanguages.add("Common");
        dwarfLanguages.add("Dwarven");
        dwarfLanguages.add("Giant");
        dwarfLanguages.add("Gnome");
        dwarfLanguages.add("Goblin");
        dwarfLanguages.add("Orc");
        dwarfLanguages.add("Terran");
        dwarfLanguages.add("Undercommon");
        return dwarfLanguages;
    }


    public void adjustRacialAbilityScores(CharacterScores characterScores) {
        characterScores.adjustAbilityScore(characterScores.getCON(), 2);
        characterScores.adjustAbilityScore(characterScores.getWIS(), 2);
        characterScores.adjustAbilityScore(characterScores.getCHA(), -2);
    }

    protected ArrayList<Traits> listRacialTraits() {
        return null;
    }
}
