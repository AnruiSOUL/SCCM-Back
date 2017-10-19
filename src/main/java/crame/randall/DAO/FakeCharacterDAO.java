package crame.randall.DAO;

import crame.randall.Entity.charactersheet.CharacterSheet;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */

@Repository
public class FakeCharacterDAO {

    private static Map<String, CharacterSheet> characters;

    static {
        characters = new HashMap<String, CharacterSheet>() {
            {
                put("Anrui", new CharacterSheet("Anrui", "Elf", "Monk"));
                put("Tanz", new CharacterSheet("Tanz", "Human", "Warrior"));
                put("Soul", new CharacterSheet("Soul", "Gnome", "Wizard"));
            }
        };
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
        CharacterSheet dbCharacterSheet = characters.get(characterSheet.getName());
        dbCharacterSheet.setRace(characterSheet.getRace());
        dbCharacterSheet.setJobClass(characterSheet.getJobClass());
    }

    public void insertCharacterSheetToDb(CharacterSheet characterSheet) {
        this.characters.put(characterSheet.getName(), characterSheet);
    }
}
