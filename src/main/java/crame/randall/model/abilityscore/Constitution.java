package crame.randall.model.abilityscore;

/**
 * Created by randallcrame on 3/23/17.
 */
public class Constitution extends AbilityScore
{

    Constitution (int score)
    {
        this.score = score;
        this.setBonus();
    }
}
