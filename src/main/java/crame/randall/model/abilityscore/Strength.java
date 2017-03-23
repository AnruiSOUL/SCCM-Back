package crame.randall.model.abilityscore;

/**
 * Created by randallcrame on 3/23/17.
 */
public class Strength extends AbilityScore
{
    Strength(int score)
    {
        this.score = score;
        this.setBonus();
    }
}
