package model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */

@Configuration
public class Wisdom extends AbilityScore
{
    public Wisdom(Integer abilityScore)
    {
        super(abilityScore);
    }
}
