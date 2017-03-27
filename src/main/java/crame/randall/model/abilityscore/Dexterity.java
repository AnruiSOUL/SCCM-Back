package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */

@Configuration
public class Dexterity extends AbilityScore
{
    public  Dexterity() {}
    Dexterity(Integer score)
    {
        this.score = score;
        this.setBonus();
    }
}
