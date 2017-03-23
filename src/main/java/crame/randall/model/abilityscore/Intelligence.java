package crame.randall.model.abilityscore;

/**
 * Created by randallcrame on 3/23/17.
 */
public class Intelligence extends AbilityScore
{
    Intelligence(int score)
    {
        this.score = score;
        this.setBonus();
    }
}
