package crame.randall.Service;

import crame.randall.Entity.CharacterScore.CharacterScores;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by AnruiSOUL on 6/7/2017.
 */
public class CharacterScoreService {

    @Autowired
    CharacterScores characterScores;


    public void createCharacterScores(CharacterScores characterScores) {
        this.characterScores = characterScores;
    }
}
