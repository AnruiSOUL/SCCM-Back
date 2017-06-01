package model.abilityscore;

import org.springframework.context.annotation.Configuration;

/**
 * Created by randallcrame on 3/23/17.
 */
@Configuration
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
        setAbilityModifier();
    }

    public int getAbilityScore()
    {
        setAbilityModifier();
        return this.abilityScore;
    }

    public void setAbilityScore(int abilityScore)
    {
        this.abilityScore = abilityScore;
    }

    public void setAbilityModifier()
    {
        this.abilityModifier = (abilityScore + itemModifier + damageModifier + tempModifier - 10)/2 ;
    }

    public int getAbilityModifier()
    {
        setAbilityModifier();
        return this.abilityModifier;
    }

    public Integer getItemModifier() {
        return itemModifier;
    }

    public void setItemModifier(Integer itemModifier) {
        this.itemModifier = itemModifier;
    }

    public Integer getDamageModifier() {
        return damageModifier;
    }

    public void setDamageModifier(Integer damageModifier) {
        this.damageModifier = damageModifier;
    }

    public Integer getTempModifier() {
        return tempModifier;
    }

    public void setTempModifier(Integer tempModifier) {
        this.tempModifier = tempModifier;
    }
}
