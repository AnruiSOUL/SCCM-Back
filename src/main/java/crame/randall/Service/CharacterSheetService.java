package crame.randall.Service;

import crame.randall.DAO.FakeCharacterDAO;
import crame.randall.Entity.charactersheet.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by AnruiSOUL on 6/5/2017.
 */

@Service
public class CharacterSheetService {

    @Autowired
    private FakeCharacterDAO fakeCharacterDAO;

    public Collection<CharacterSheet> getAllCharacters() {
        return fakeCharacterDAO.getAllCharacters();
    }


    public CharacterSheet getCharacterByName(String name) {
        return fakeCharacterDAO.getCharacterByName(name);
    }

    public void removeCharacterByNameS(String name) {
        this.fakeCharacterDAO.removeCharacterByName(name);
    }

    public void updateCharacterSheet(CharacterSheet characterSheet) {
        this.fakeCharacterDAO.updateCharacterSheet(characterSheet);
    }

    public void insertCharacterSheet(CharacterSheet characterSheet) {
        fakeCharacterDAO.insertCharacterSheetToDb(characterSheet);
    }
}
