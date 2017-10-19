package crame.randall.Entity.charactersheet;

import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.race.Race;
import crame.randall.Entity.skills.Skill;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;


/**
 * Created by AnruiSOUL on 6/1/2017.
 */

@Configuration
public class CharacterSheet {

  private String name;
  private String race;
  private String dndClass;
  private Size size;
  private CharacterScores characterScores;
  private Speed speed;
  private ArrayList<Skill> skillsList;
  private ArrayList<String> languageList;

  public CharacterSheet(){}

  public CharacterSheet(String name, String race, String jobClass){
      this.name = name;
      this.race = race;
      this.dndClass = jobClass;
  }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getJobClass() {
        return dndClass;
    }

    public void setJobClass(String jobClass) {
        this.dndClass = dndClass;
    }

    private void racialAdjustments(Race race) {
        this.size = race.getSize();
        race.adjustRacialAbilityScores(this.characterScores);
        setTraitModifiers(race.getRacialTraits());
        this.speed = race.getSpeed();
        addLanguages(race.getRacialLanguages());
    }

    private void addLanguages(ArrayList<String> racialLanguages) {
    }

    private void setTraitModifiers(ArrayList<Traits> racialTraits) {
    }

}
