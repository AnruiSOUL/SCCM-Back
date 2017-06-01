package model.charactersheet;

import model.Weapon.Weapon;
import model.abilityscore.CharacterScores;
import model.armor.Armor;
import model.armorclass.ArmorClass;
import model.attackbonuses.AttackBonuses;
import model.basicinformation.BasicInformation;
import model.combatmaneuver.CombatManeuverBonus;
import model.combatmaneuver.CombatManeuverDefense;
import model.defenses.Defenses;
import model.feats.Feat;
import model.hitpoint.HitPoint;
import model.initiative.Initiative;
import model.inventory.CarryCapacity;
import model.inventory.Item;
import model.inventory.Money;
import model.magicitems.MagicItem;
import model.savingthrows.CharacterSavingThrows;
import model.skills.Skill;
import model.specialabilities.SpecialAbilities;
import model.speed.Speed;
import model.trait.Traits;

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
