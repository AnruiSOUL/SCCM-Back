package crame.randall.Entity.armor;

/**
 * Created by AnruiSOUL on 6/1/2017.
 */
public class Armor {
    private String armorName;
    private ArmorType armorType;
    private Integer armorBonus;
    private Integer maxDex;
    private Integer armorCheckPenalty;
    private Double spellFailureChance;
    private Integer maxSpeed;
    private String specialQualities;
    private Integer cost;

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public Integer getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(Integer armorBonus) {
        this.armorBonus = armorBonus;
    }

    public Integer getMaxDex() {
        return maxDex;
    }

    public void setMaxDex(Integer maxDex) {
        this.maxDex = maxDex;
    }

    public Integer getArmorCheckPenalty() {
        return armorCheckPenalty;
    }

    public void setArmorCheckPenalty(Integer armorCheckPenalty) {
        this.armorCheckPenalty = armorCheckPenalty;
    }

    public Double getSpellFailureChance() {
        return spellFailureChance;
    }

    public void setSpellFailureChance(Double spellFailureChance) {
        this.spellFailureChance = spellFailureChance;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getSpecialQualities() {
        return specialQualities;
    }

    public void setSpecialQualities(String specialQualities) {
        this.specialQualities = specialQualities;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
