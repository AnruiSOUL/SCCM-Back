package crame.randall.Entity.charactersheet;

import crame.randall.Entity.Weapon.Weapon;
import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Entity.armor.Armor;
import crame.randall.Entity.basicinformation.BasicInformation;
import crame.randall.Entity.feats.Feat;
import crame.randall.Entity.inventory.Item;
import crame.randall.Entity.inventory.Money;
import crame.randall.Entity.magicitems.MagicItem;
import crame.randall.Entity.skills.Skill;
import crame.randall.Entity.specialabilities.SpecialAbilities;
import crame.randall.Entity.trait.Traits;

import java.util.ArrayList;

/**
 * Created by AnruiSOUL on 6/1/2017.
 */
public class CharacterSheet {

    private CharacterScores characterScores;


    private BasicInformation characterInformation;


    private ArrayList<Armor> armory;
    private ArrayList<Weapon> weaponArmory;
    private ArrayList<Skill> skillList;
    private ArrayList<Feat> featsList;
    private ArrayList<SpecialAbilities> specialAbilitiesArrayList;
    private ArrayList<Traits> traitsArrayList;
    private ArrayList<MagicItem> magicItemsList;
    private Money characterMoney;
    private ArrayList<Item> itemList;

    public BasicInformation getCharacterInformation() {
        return characterInformation;
    }

    public void setCharacterInformation(BasicInformation characterInformation) {
        this.characterInformation = characterInformation;
    }

    public CharacterScores cgetCharacterScores() {
        return characterScores;
    }

    public void setCharacterScores(CharacterScores characterScores) {
        this.characterScores = characterScores;
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
