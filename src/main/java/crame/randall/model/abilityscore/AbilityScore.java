package crame.randall.model.abilityscore;

/**
 * Created by randallcrame on 3/23/17.
 */
public abstract class AbilityScore
{
    int score;
    int bonus;

    public void setBonus()
    {
        this.bonus = (this.score - 10)/2;
    }

    public int getScore()
    {
        return score;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    public int getBonus()
    {
        return bonus;
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }
}
