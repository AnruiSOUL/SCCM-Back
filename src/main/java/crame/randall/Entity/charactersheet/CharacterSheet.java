package crame.randall.Entity.charactersheet;

import crame.randall.Entity.Weapon.Weapon;
import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Entity.armor.Armor;
import crame.randall.Entity.armorclass.ArmorClass;
import crame.randall.Entity.attackbonuses.AttackBonuses;
import crame.randall.Entity.basicinformation.BasicInformation;
import crame.randall.Entity.combatmaneuver.CombatManeuverBonus;
import crame.randall.Entity.combatmaneuver.CombatManeuverDefense;
import crame.randall.Entity.defenses.Defenses;
import crame.randall.Entity.feats.Feat;
import crame.randall.Entity.hitpoint.HitPoint;
import crame.randall.Entity.initiative.Initiative;
import crame.randall.Entity.inventory.CarryCapacity;
import crame.randall.Entity.inventory.Item;
import crame.randall.Entity.inventory.Money;
import crame.randall.Entity.magicitems.MagicItem;
import crame.randall.Entity.savingthrows.CharacterSavingThrows;
import crame.randall.Entity.skills.Skill;
import crame.randall.Entity.specialabilities.SpecialAbilities;
import crame.randall.Entity.speed.Speed;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;

/**
 * Created by AnruiSOUL on 6/1/2017.
 */
public class CharacterSheet {
    private BasicInformation characterInformation;
    private CharacterScores characterScores;
    private HitPoint HP;
    private Initiative initiative;
    private Speed speed;
    private Defenses defenses;
    private AttackBonuses attBonues;
    private CharacterSavingThrows CharSavingThrow;
    private CombatManeuverBonus CMB;
    private CombatManeuverDefense CMD;
    private ArmorClass AC;
    private ArrayList<Armor> armory;
    private ArrayList<Weapon> weaponArmory;
    private ArrayList<Skill> skillList;
    private ArrayList<Feat> featsList;
    private ArrayList<SpecialAbilities> specialAbilitiesArrayList;
    private ArrayList<Traits> traitsArrayList;
    private ArrayList<MagicItem> magicItemsList;
    private CarryCapacity carryCapacity;
    private Money characterMoney;
    private ArrayList<Item> itemList;

    public BasicInformation getCharacterInformation() {
        return characterInformation;
    }

    public void setCharacterInformation(BasicInformation characterInformation) {
        this.characterInformation = characterInformation;
    }

    public CharacterScores getCharacterScores() {
        return characterScores;
    }

    public void setCharacterScores(CharacterScores characterScores) {
        this.characterScores = characterScores;
    }

    public HitPoint getHP() {
        return HP;
    }

    public void setHP(HitPoint HP) {
        this.HP = HP;
    }

    public Initiative getInitiative() {
        return initiative;
    }

    public void setInitiative(Initiative initiative) {
        this.initiative = initiative;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Defenses getDefenses() {
        return defenses;
    }

    public void setDefenses(Defenses defenses) {
        this.defenses = defenses;
    }

    public AttackBonuses getAttBonues() {
        return attBonues;
    }

    public void setAttBonues(AttackBonuses attBonues) {
        this.attBonues = attBonues;
    }

    public CharacterSavingThrows getCharSavingThrow() {
        return CharSavingThrow;
    }

    public void setCharSavingThrow(CharacterSavingThrows charSavingThrow) {
        CharSavingThrow = charSavingThrow;
    }

    public CombatManeuverBonus getCMB() {
        return CMB;
    }

    public void setCMB(CombatManeuverBonus CMB) {
        this.CMB = CMB;
    }

    public CombatManeuverDefense getCMD() {
        return CMD;
    }

    public void setCMD(CombatManeuverDefense CMD) {
        this.CMD = CMD;
    }

    public ArmorClass getAC() {
        return AC;
    }

    public void setAC(ArmorClass AC) {
        this.AC = AC;
    }

    public ArrayList<Armor> getArmory() {
        return armory;
    }

    public void setArmory(ArrayList<Armor> armory) {
        this.armory = armory;
    }

    public ArrayList<Weapon> getWeaponArmory() {
        return weaponArmory;
    }

    public void setWeaponArmory(ArrayList<Weapon> weaponArmory) {
        this.weaponArmory = weaponArmory;
    }

    public ArrayList<Skill> getSkillList() {
        return skillList;
    }

    public void setSkillList(ArrayList<Skill> skillList) {
        this.skillList = skillList;
    }

    public ArrayList<Feat> getFeatsList() {
        return featsList;
    }

    public void setFeatsList(ArrayList<Feat> featsList) {
        this.featsList = featsList;
    }

    public ArrayList<SpecialAbilities> getSpecialAbilitiesArrayList() {
        return specialAbilitiesArrayList;
    }

    public void setSpecialAbilitiesArrayList(ArrayList<SpecialAbilities> specialAbilitiesArrayList) {
        this.specialAbilitiesArrayList = specialAbilitiesArrayList;
    }

    public ArrayList<Traits> getTraitsArrayList() {
        return traitsArrayList;
    }

    public void setTraitsArrayList(ArrayList<Traits> traitsArrayList) {
        this.traitsArrayList = traitsArrayList;
    }

    public ArrayList<MagicItem> getMagicItemsList() {
        return magicItemsList;
    }

    public void setMagicItemsList(ArrayList<MagicItem> magicItemsList) {
        this.magicItemsList = magicItemsList;
    }

    public CarryCapacity getCarryCapacity() {
        return carryCapacity;
    }

    public void setCarryCapacity(CarryCapacity carryCapacity) {
        this.carryCapacity = carryCapacity;
    }

    public Money getCharacterMoney() {
        return characterMoney;
    }

    public void setCharacterMoney(Money characterMoney) {
        this.characterMoney = characterMoney;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }
}
