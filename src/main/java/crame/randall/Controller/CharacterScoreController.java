package crame.randall.Controller;

import crame.randall.Entity.CharacterScore.CharacterScores;
import crame.randall.Service.CharacterScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by AnruiSOUL on 6/7/2017.
 */
public class CharacterScoreController {

    @Autowired
    private CharacterScoreService characterScoresService;


    public void createCharacterScores(@RequestBody CharacterScores characterScores){
        characterScoresService.createCharacterScores(characterScores);
    }
}
