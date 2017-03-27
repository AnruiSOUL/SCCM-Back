package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */

@Configuration
public class Strength extends AbilityScore
{
    public Strength() {}
    public Strength(Integer score)
    {
        this.score = score;
        this.setBonus();
    }
}
