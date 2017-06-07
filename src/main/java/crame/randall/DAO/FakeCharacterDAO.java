package crame.randall.DAO;

import crame.randall.Entity.CharacterScore.*;
import crame.randall.Entity.basicinformation.BasicInformation;
import crame.randall.Entity.basicinformation.Size;
import crame.randall.Entity.charactersheet.CharacterSheet;
import crame.randall.Entity.hitpoint.HitPoint;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */
public class FakeCharacterDAO {
    private static Map<String, CharacterSheet> characters;
    private static BasicInformation basicInformation;
    private static CharacterScores characterScores;
    private static HitPoint hitPoint;

    static {
        basicInformation = new BasicInformation("Anrui", "Human", "Monk", "Male",
                18, Size.MEDIUM, "Law Neutral", "AGod", "Unknown", "Monk 1",
                "None", 0L, "Common", 69, 160, "brown",
                "black", "Olive", "East");
        characterScores = new CharacterScores(new Strength(16), new Dexterity(14),
                new Constitution(14), new Intelligence(10), new Wisdom(18),
                new Charisma(10));
        hitPoint = new HitPoint(10);

        characters = new HashMap<String,CharacterSheet>() {
            {
                put("Anrui", new CharacterSheet());
            }
        };
    }

    public CharacterScores getCharacterScores(){
        return characterScores;
    }


    public Collection<CharacterSheet> getAllCharacters() {
        return this.characters.values();
    }

    public CharacterSheet getCharacterByName(String name){
        return this.characters.get(name);
    }

    public void removeCharacterByName(String name){
        this.characters.remove(name);
    }

    public void updateCharacterSheet(CharacterSheet characterSheet){
        //...
    }

    public void insertCharacterSheetToDb(CharacterSheet characterSheet) {
        this.characters.put(characterSheet.getCharacterInformation().getCharacterName(), characterSheet);
    }
}
