package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */

@Configuration
public class Intelligence extends AbilityScore
{
    public Intelligence() {}
    Intelligence(Integer score)
    {
        this.score = score;
        this.setBonus();
    }
}
