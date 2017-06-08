package crame.randall.Entity.CharacterScore;


/**
 * Created by randallcrame on 3/23/17.
 */

public abstract class AbilityScore
{
    private int abilityScore;
    private int itemBonus;
    private int abilityModifier;
    private int temporaryAbilityScore;
    private int temporaryModifier;

    AbilityScore(int abilityScore){
        this.abilityScore = abilityScore;
    }

    public int getAbilityScore() {
        return abilityScore;
    }

    public void setAbilityScore(int abilityScore) {
        this.abilityScore = abilityScore;
    }

    public int getItemBonus() {
        return itemBonus;
    }

    public void setItemBonus(int itemBonus) {
        this.itemBonus = itemBonus;
    }

    public int getAbilityModifier() {
        return abilityModifier;
    }

    public void setAbilityModifier(int abilityModifier) {
        this.abilityModifier = abilityModifier;
    }

    public int getTemporaryAbilityScore() {
        return temporaryAbilityScore;
    }

    public void setTemporaryAbilityScore(int temporaryAbilityScore) {
        this.temporaryAbilityScore = temporaryAbilityScore;
    }

    public int getTemporaryModifier() {
        return temporaryModifier;
    }

    public void setTemporaryModifier(int temporaryModifier) {
        this.temporaryModifier = temporaryModifier;
    }
}
