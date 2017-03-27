package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */
@Configuration
public class Charisma extends AbilityScore
{
    public Charisma() {}
    public Charisma(Integer score)
    {
        this.score = score;
        this.setBonus();
    }
}
