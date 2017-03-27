package crame.randall.model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */
@Configuration
public abstract class AbilityScore
{
    Integer score;
    Integer bonus;

    public void setBonus()
    {
        this.bonus = (score - 10)/2;
    }

    public int getScore()
    {
        return this.score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getBonus()
    {
        setBonus();
        return this.bonus;
    }

    public void setBonus(int bonus)
    {
       this.bonus = bonus;
    }
}
