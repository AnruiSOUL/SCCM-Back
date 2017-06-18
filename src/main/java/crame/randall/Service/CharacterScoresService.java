package crame.randall.Service;

import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Entity.charactersheet.CharacterSheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AnruiSOUL on 6/7/2017.
 */

@Service
public class CharacterScoresService {

    @Autowired
    CharacterSheet characterSheet;


    public void createCharacterScores(CharacterScores characterScores) {
        this.characterSheet.setCharacterScores(characterScores);
    }

    public CharacterScores getCharacterScore(){
        return characterSheet.getCharacterScores();
    }


}
