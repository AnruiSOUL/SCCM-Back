package model.armorclass;

import model.abilityscore.Dexterity;
import model.basicinformation.Size;

/**
 * Created by AnruiSOUL on 6/1/2017.
 */
public class ArmorClass {
    private Integer totalAC;
    private Integer touchAC;
    private Integer flatfootedAC;
    private Integer armorBonus;
    private Integer shieldBonus;
    private Integer dexMod;
    private Integer sizeBonus;
    private Integer naturalBonus;
    private Integer deflectionBonus;
    private Integer dodgeBonus;
    private Integer miscBonus;

    public Integer getTotalAC() {
        return totalAC;
    }

    public void setTotal() {
        this.totalAC = 10 + getArmorBonus() + getShieldBonus() + getDexMod() + getSizeBonus() + getNaturalBonus() + getDeflectionBonus() + getMiscBonus();
    }

    public Integer getTouchAC() {
        return touchAC;
    }

    public void setTouchAC() {
        this.touchAC = 10 + getDexMod() + getSizeBonus() + getDeflectionBonus();
    }

    public Integer getFlatfootedAC() {
        return flatfootedAC;
    }

    public void setFlatfootedAC(Integer flatfootedAC) {
        this.flatfootedAC = 10 + getArmorBonus() + getShieldBonus() + getSizeBonus() + getNaturalBonus() + getDeflectionBonus() + getMiscBonus();
    }

    public Integer getArmorBonus() {
        return armorBonus;
    }

    public void setArmorBonus(Integer armorBonus) {
        this.armorBonus = armorBonus;
    }

    public Integer getShieldBonus() {
        return shieldBonus;
    }

    public void setShieldBonus(Integer shieldBonus) {
        this.shieldBonus = shieldBonus;
    }

    public Integer getDexMod() {
        return dexMod;
    }

    public void setDexMod(Dexterity dexterity) {
        this.dexMod = dexterity.getAbilityModifier();
    }

    public Integer getSizeBonus() {
        return sizeBonus;
    }

    public void setSizeBonus(Size sizeBonus) {
        Integer bonus = 0;
        switch (sizeBonus) {
            case FINE: bonus = 8; break;
            case DIMINUTIVE: bonus = 4; break;
            case TINY: bonus = 2; break;
            case SMALL: bonus = 1; break;
            case MEDIUM: bonus = 0; break;
            case LARGE: bonus = -1; break;
            case HUGE: bonus = -2; break;
            case GARGANTUAN: bonus = -4; break;
            case COLOSSAL: bonus = -8; break;
            default: break;
        }
        this.sizeBonus = bonus;
    }

    public Integer getNaturalBonus() {
        return naturalBonus;
    }

    public void setNaturalBonus(Integer naturalBonus) {
        this.naturalBonus = naturalBonus;
    }

    public Integer getDeflectionBonus() {
        return deflectionBonus;
    }

    public void setDeflectionBonus(Integer deflectionBonus) {
        this.deflectionBonus = deflectionBonus;
    }

    public Integer getDodgeBonus() {
        return dodgeBonus;
    }

    public void setDodgeBonus(Integer dodgeBonus) {
        this.dodgeBonus = dodgeBonus;
    }

    public Integer getMiscBonus() {
        return miscBonus;
    }

    public void setMiscBonus(Integer miscBonus) {
        this.miscBonus = miscBonus;
    }
}
