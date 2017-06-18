package crame.randall.Entity.charactersheet;

import org.springframework.context.annotation.Configuration;


/**
 * Created by AnruiSOUL on 6/1/2017.
 */

@Configuration
public class CharacterSheet {


  private String name;
  private String race;
  private String jobClass;
  private int lvl;

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

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
