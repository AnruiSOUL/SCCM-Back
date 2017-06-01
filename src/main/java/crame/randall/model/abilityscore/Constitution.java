package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */
@Configuration
public class Constitution extends AbilityScore
{
    public Constitution(){}
    public Constitution (Integer score)
    {
        this.abilityScore = score;
        this.setBonus();
    }
}
