package crame.randall.Service;

import crame.randall.Entity.CharacterScore.CharacterScores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by AnruiSOUL on 6/7/2017.
 */

@Service
public class CharacterScoresService {

    @Autowired
    CharacterScores characterScores;


    public void createCharacterScores(CharacterScores characterScores) {
        this.characterScores = characterScores;
    }
}
