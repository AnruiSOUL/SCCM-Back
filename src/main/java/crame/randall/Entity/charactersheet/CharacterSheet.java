package crame.randall.Entity.charactersheet;

import crame.randall.Entity.CharacterScore.CharacterScores;
import org.springframework.context.annotation.Configuration;


/**
 * Created by AnruiSOUL on 6/1/2017.
 */

@Configuration
public class CharacterSheet {

  private String name;
  private String race;
  private String jobClass;

  public CharacterSheet(){}

  public CharacterSheet(String name, String race, String jobClass){
      this.name = name;
      this.race = race;
      this.jobClass = jobClass;
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
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

}
