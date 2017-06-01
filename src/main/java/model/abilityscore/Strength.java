package model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */

@Configuration
public class Strength extends AbilityScore
{
    public Strength(Integer abilityScore)
    {
        super(abilityScore);
    }
}
