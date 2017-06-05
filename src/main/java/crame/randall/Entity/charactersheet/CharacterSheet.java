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
    private BasicInformation chracterInformation;
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
}
