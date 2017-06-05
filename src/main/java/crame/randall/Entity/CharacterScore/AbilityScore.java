package crame.randall.Entity.CharacterScore;


/**
 * Created by randallcrame on 3/23/17.
 */

public abstract class AbilityScore
{
    private Integer abilityScore;
    private Integer abilityModifier;
    private Integer itemModifier;
    private Integer damageModifier;
    private Integer tempModifier;

    AbilityScore(int abilityScore)
    {
        this.abilityScore = abilityScore;
    }

    public int getAbilityScore()
    {
        return this.abilityScore;
    }

    public void setAbilityScore(int abilityScore)
    {
        this.abilityScore = abilityScore;
    }

    public void setAbilityModifier(int abilityModifier)
    {
        this.abilityModifier = abilityModifier;
    }

    public int getAbilityModifier()
    {
        return this.abilityModifier;
    }

    public Integer getItemModifier()
    {
        return itemModifier;
    }

    public void setItemModifier(Integer itemModifier)
    {
        this.itemModifier = itemModifier;
    }

    public Integer getDamageModifier()
    {
        return damageModifier;
    }

    public void setDamageModifier(Integer damageModifier)
    {
        this.damageModifier = damageModifier;
    }

    public Integer getTempModifier()
    {
        return tempModifier;
    }

    public void setTempModifier(Integer tempModifier)
    {
        this.tempModifier = tempModifier;
    }
}
